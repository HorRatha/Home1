package OperatorLesson;

import java.util.Scanner;

public class TestExercise2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("[+] Insert rang of number: ");
        int number = new Scanner(System.in).nextInt();
        int numberOfOdd  = 0;
        int numberOfEven = 0;
        for(int i=1;i<=number;i++){
            if(i%2==0){
                numberOfEven++;
            }else {
                numberOfOdd++;
            }
        }
        System.out.println("Range of number from ( 1 to " + number + " ) has odd and even number like below");
        System.out.println("Even: " + numberOfEven);
        System.out.println("Odd: " + numberOfOdd);

    }
}
