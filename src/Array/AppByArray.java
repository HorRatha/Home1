package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AppByArray {
    public static void main(String[] args) {
        System.out.println("Numbers");
        Integer [] numbers = {1,2,3,4};
        System.out.println(Arrays.toString(numbers));
        System.out.print("Input any element to delete: ");
        int deleteNumber = new Scanner(System.in).nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==deleteNumber){
                numbers[i] = null;
            }
        }
        System.out.println("Number after deleted");
        for(Integer n: numbers){
            if(n!=null){
                System.out.println(n);
            }
        }

    }
}
