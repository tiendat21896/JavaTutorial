/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DISM_ADF1;

/**
 *
 * @author 84122
 */
public class Flight {

    private int number;
    private String destination;

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void display() {
        System.out.println(number + "," + destination);
    }

    public static void main(String[] args) {
        Flight g1 = new Flight(857, "Toronto");
        System.out.println("Output:");
        g1.display();
    }
}
