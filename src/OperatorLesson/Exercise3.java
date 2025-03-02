package OperatorLesson;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            System.out.print("=".repeat(i));
            Thread.sleep(200);
        };
        System.out.println();
        for(int i=0;i<6;i++){
            System.out.print("-".repeat(i));
            Thread.sleep(200);
        };
        System.out.print(" Food Panda ");
        for(int i=0;i<6;i++){
            System.out.print("-".repeat(i));
            Thread.sleep(200);
        };
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.print("-".repeat(i));
            Thread.sleep(200);
        };
        while (true){
            System.out.println("\n1. View All Products");
            System.out.println("2. View Cart");
            System.out.println("3. Start Order");
            System.out.println("4. View Order History");
            System.out.println("5. Exit :)");
            System.out.print("[+] Insert option: ");
            int opt = new Scanner(System.in).nextInt();
            switch (opt){
                case 1-> System.out.println("View all Products");
                case 5-> {
                    System.out.println("Exit :(");
                    System.exit(0);
                }
            }
            System.out.print(">> Press any key to continue");
            new Scanner(System.in).nextLine();
        }
    }
}
