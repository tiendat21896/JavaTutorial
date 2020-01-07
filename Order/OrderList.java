/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 84122
 */
public class OrderList {
    ArrayList<Order> arl = new ArrayList<>();
    Order order = new Order();
    
    public void MenuList() {
        for (int i = 0; i < arl.size(); i++) {
            order = arl.get(i);
            order.Bill();
        }
    }
    
    public void Check_Menu() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Nhập Tên Món Ăn: ");
        String foodName = scanner.nextLine();
        for (int i = 0; i < arl.size(); i++) {
            order = arl.get(i);
            if (order.getFoodName().equals(foodName)) {
                this.addQuantity(foodName);
                count++;
            }
        }
        if (count == 0) {
            this.addFood(foodName);
            System.out.println("2");
        }
    }

    private void addQuantity(String foodName) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arl.size(); i++) {
            order = arl.get(i);
            if (order.getFoodName().equals(foodName)) {
                System.out.println("Nhập Số Lượng Đặt: ");
                int New_Amount = scanner.nextInt();
                order.setAmount(order.getAmount() + New_Amount);
                arl.set(i,order);
            }
        }
    }

    private void addFood(String foodName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Nhập Số Lượng Đặt: ");
        int Amount = scanner.nextInt();
        System.out.println("- Nhập Vào Giá Tiền: ");
        int Price = scanner.nextInt();

        order = new Order(foodName, Amount, Price);
        arl.add(order);
    }
    
    public void DeleteOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Nhập Tên Món Ăn: ");
        String foodName = scanner.nextLine();
        for (int i = 0; i < arl.size(); i++) {
            order = arl.get(i);
            if (order.getFoodName().equals(foodName)) {
                arl.remove(i);
                System.out.println("Đã Xóa " + foodName + " Trong Order.");
            } else {
                System.out.println("Không Tìm Thấy " + foodName + " Trong Thực Đơn.");
            }
        }
    }
}
