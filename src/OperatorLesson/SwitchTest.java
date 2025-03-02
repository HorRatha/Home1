package OperatorLesson;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.print("[+] Insert option: ");
        int number = new Scanner(System.in).nextInt();
        switch(number) {
            case 1:
                System.out.print("[+] This is option 1 ");
                break;
            case 2:
                System.out.println("[+] This is option 2 ");
                break;
            case 3:
                System.out.println("[+] This is option 3 ");
                break;
            default: {
                System.out.println("[+] No option found ");
            }
        }
    }
}
