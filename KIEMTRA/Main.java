package KIEMTRA;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise = 0;
        String name = null;
        String company = null;
        String email = null;
        String phone = null;
        ContactList contactList = new ContactList();
        do {
            System.out.println("Enter your choise: ");
            System.out.println("1. Add a new Contact.");
            System.out.println("2. Find a Contact by name.");
            System.out.println("3. Display Contact.");
            System.out.println("4. Exit");
            System.out.println("Choise: ");
            choise = sc.nextInt();
            sc.nextLine();
            switch (choise) {
                case 1:
                    System.out.println("Enter name:");
                    name = sc.nextLine();
                    System.out.println("Enter company: ");
                    company = sc.nextLine();
                    System.out.println("Enter email: ");
                    email = sc.nextLine();
                    System.out.println("Enter Phone: ");
                    phone = sc.nextLine();
                    contactList.AddNewPhoneNumber(new Contact(name , company , email , phone));
                    System.out.println("New Contact is added");
                    contactList.Display();
                    break;
                case 2:
                    System.out.println("Enter Name: ");
                    name = sc.nextLine();
                    contactList.SearchContact(name);
                    break;
                case 3:
                    contactList.Display();
                    break;
                case 4:
                    System.exit(4);
                default:
                    break;
            }
        } while (choise != 4);
    }
}
