package Array;

import java.util.Scanner;

public class FindMaxArray {
    public static void main(String[] args) {
        System.out.print("[+] Insert length of array: ");
        int n = new Scanner(System.in).nextInt();
        Integer [] numbers = new Integer[n];
        // insert each array's element
        for(int i=0;i<numbers.length;i++){
            System.out.print("[+] Insert element [" + i + "]: ");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        int max = numbers[0];
        for(Integer a: numbers){
            if(max<a){
                max = a;
            }
        }
        System.out.println("This is maximum of above array: " + max);

    }
}
