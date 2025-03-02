package OperatorLesson;

import java.util.Scanner;

public class ControlFlowTest {
    public static void main(String[] args) {
       double math, english, khmer;
        System.out.print("[+] Insert English Score: ");
        english = new Scanner(System.in).nextDouble();
        System.out.print("[+] Insert Math Score: ");
        math = new Scanner(System.in).nextDouble();
        System.out.print("[+] Insert Khmer Score: ");
        khmer = new Scanner(System.in).nextDouble();
        double avg = (math + english + khmer) / 3;
        if (avg <=100 && avg >= 90) {
            System.out.println("You are grade A");
        }else if (avg <= 90 && avg >= 80 ) {
            System.out.println("You are grade B");
        }else if (avg <= 80 && avg >= 70) {
            System.out.println("You are grade C");
        }else if (avg <= 70 && avg >= 60) {
            System.out.println("You are grade D");
        }else if (avg <= 60 && avg >= 50) {
            System.out.println("You are grade E");
        }else{
            System.out.println("You are Fail");
        }
    }
}
