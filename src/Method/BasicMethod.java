package Method;

import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class BasicMethod {
    public static void Display(){
        System.out.println("=====================");
        System.out.println("  Welcome To E-Mart  ");
        System.out.println("=====================");
        System.out.println("""
                1. List All Product
                2. Insert Product
                3. Update Product
                4. Delete Product
                5. Exit...
                """);
    }
    public static void printMessage(){
        System.out.println("Hello, Nice to meet you");
    }
    public static void sumClass(){
        System.out.print("Insert number A: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Insert number B: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println(STR."Sum of a+b: = \{a+b}");
    }

    public static void findMax(int a, int b){
        if(a>b){
            System.out.println(a + ">" + b);
        }else {
            System.out.println(a + "<" + b);
        }

    }
    public static void main(String[] args) {
        Display();
        printMessage();

        findMax(4,7);
        sumClass();
    }
}
