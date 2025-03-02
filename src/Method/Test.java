package Method;

import java.util.Scanner;

public class Test {
    public static int sum(){
        System.out.print("Insert a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Insert b: ");
        int b = new Scanner(System.in).nextInt();
        return a+b;
    }
    public static void main(String[] args) {
        int result = sum();
        System.out.println("Sum:" + result);
    }
}
