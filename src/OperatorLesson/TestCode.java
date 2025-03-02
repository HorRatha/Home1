package OperatorLesson;

import java.util.Scanner;

public class TestCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much i love you?😭❤️❤️: ");
        int count = scanner.nextInt(); // Get user input

        for (int i = 1; i <= count; i++) { // Loop based on user input
            try {
                Thread.sleep(01); // 300ms delay for better readability
//                System.out.println("Here it is!!!😗");
                System.out.println(i + ". I love you 3000❤️😗🫣");
            } catch (InterruptedException e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close(); // Close the scanner
        System.out.println("Finished printing " + count + " times!");
    }
}