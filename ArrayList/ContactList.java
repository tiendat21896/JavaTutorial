/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private String name;
    private String numberphone;
    private static List<ContactList> contact = new ArrayList<>();

    public ContactList(String name, String numberphone) {
        this.name = name;
        this.numberphone = numberphone;
    }

    public ContactList() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberphone() {
        return numberphone;
    }


    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;

    }

    public void addcontactList(String name, String numberphone) {
        contact.add(new ContactList(name, numberphone));
    }

    public void updateContact(int index, String name, String numberphone) {
        contact.set(index, new ContactList(name, numberphone));
        System.out.println("Updated!");
        System.out.println("name" + (index + 1) + " " + name);
    }

    public void display() {
        System.out.println("You have" + contact.size() + "items in list");
        for (int i = 0; i < contact.size(); i++) {
            System.out.println("Users:" + (i + 1) + contact.get(i).getName());
            System.out.println("\t" + (i + 1) + contact.get(i).getNumberphone());
        }
    }

    public static void main(String[] args) {
        ContactList obj = new ContactList();
        System.out.println("List Users : ");
        obj.addcontactList("Dat", "0969696969");
        obj.addcontactList("Ngao", "0989898989");
        obj.display();
    }


}

