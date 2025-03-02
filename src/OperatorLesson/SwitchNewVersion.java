package OperatorLesson;

import java.util.Scanner;

public class SwitchNewVersion {
    public static void main(String[] args) {
        System.out.print("[+] Insert option: ");

        int number = new Scanner(System.in).nextInt();
        switch(number){
            case 1-> System.out.println("This is option1");
            case 2-> System.out.println("This is option2");
            case 3-> {
                System.out.println("This is option3");
            }
            case 4 -> System.out.println("This is option4");
            default -> System.out.println("This is option5");
        }
    }
}
