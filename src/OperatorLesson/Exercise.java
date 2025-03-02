package OperatorLesson;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("* ================ Welcome to my Mart ================");
        System.out.println("* 1. List all Products");
        System.out.println("* 2. Add new Product");
        System.out.println("* 3. Search Product by code");
        System.out.println("* 4. Delete Product");
        System.out.println("* ====================================================");
        System.out.println("[+] Insert option: ");
        int number = new Scanner(System.in).nextInt();
        switch(number){
            case 1-> System.out.println("Welcome to List of Products");
            case 2-> System.out.println("Welcome to Add new Product");
            case 3-> System.out.println("Welcome to Search Product by code");
            case 4-> System.out.println("Welcome to Delete Product");
            default -> System.out.println("Invalid option");
        }
    }
}
