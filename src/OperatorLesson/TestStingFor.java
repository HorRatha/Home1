package OperatorLesson;

import java.util.Scanner;

public class TestStingFor {
    public static void main(String[] args) {
        System.out.print("[+] Insert your name: ");
        String name = new Scanner(System.in).nextLine();
        if(name.equalsIgnoreCase("Sok")) {
            System.out.println(name + " has been allowed");
        }
    }
}
