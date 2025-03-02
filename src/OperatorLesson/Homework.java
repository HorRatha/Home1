package OperatorLesson;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Welcome to Pyramid Style
                    1. Pyramid 1-5
                    2. Pyramid Increment 1-5
                    3. Pyramid Continue Number 1-15
                    4. Pyramid by *
                    5. Exit...
                    """);
            System.out.print("Input your option: ");
            int number = scanner.nextInt();
            int n = 5;
            switch (number) {
                case 1 -> {
                    for (int i = 1; i <= n; i++) {

                        for (int j = 1; j <= i; j++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    int num = 1;
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(num + " ");
                            num++;
                        }
                        System.out.println();
                    }
                }
                case 4 -> {
                    for (int i = 1; i <= n; i++) {
                        for (int j = i; j < n; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                default -> System.exit(0);
            }
            System.out.print(">> Press any key to continue");
            new Scanner(System.in).nextLine();
        }
    }
}