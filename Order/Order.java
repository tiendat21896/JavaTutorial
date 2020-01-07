/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author 84122
 */
public class Order {

    private String FoodName;
    private int Amount;
    private int Price;
    private int Total;

    public Order() {
    }
    
    public Order(String FoodName, int Amount, int Price) {
        this.FoodName = FoodName;
        this.Amount = Amount;
        this.Price = Price;
    }

    public Order(String FoodName, int Amount, int Price, int Total) {
        this.FoodName = FoodName;
        this.Amount = Amount;
        this.Price = Price;
        this.Total = Total;
    }

  

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    
    public void Bill() {
        this.Total = this.Amount * this.Price;
        String info = "Ten mon an: " + this.FoodName + " | So luong: " + this.Amount + " | Gia tien: " + this.Price + " | Tong tien: " + this.Total;
        System.out.println(info);
    }

}
