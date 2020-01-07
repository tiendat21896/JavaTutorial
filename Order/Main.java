/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.util.Scanner;

/**
 *
 * @author 84122
 */
public class Main {
    public static void main(String[] args) {
        int choose;
        OrderList menu = new OrderList();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n");
            System.out.println("***MENU Lữ Quán***");
            System.out.println("1. Xem Menu");
            System.out.println("2. Thêm Món Ăn");
            System.out.println("3. Xóa Món Ăn");
            System.out.println("0. Kết Thúc Đặt Hàng");
            System.out.println("---");
            System.out.print("Chon: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    menu.MenuList();
                    break;
                case 2:
                    menu.Check_Menu();
                    break;
                case 3:
                    menu.DeleteOrder();
                    break;
                case 0:
                    System.out.println("Kết Thúc Đặt Hàng ...");
                    break;
                default:
                    System.out.println("Loading .......");
            }
        } while (choose != 0);
    }
}
