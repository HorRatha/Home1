package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        System.out.print("Insert number of element: ");
        int number =new Scanner(System.in).nextInt();
        String [] names = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print(" Insert name: ["+ i +"]: ");
            names[i] = new Scanner(System.in).nextLine();
        }
        System.out.println("All name");
        System.out.println(Arrays.toString(names));
//        modify name
        System.out.println("Input old name for update new name: ");
        String oldName = new Scanner(System.in).nextLine();
        for(int i = 0; i <names.length; i++) {
            if(names[i].equals(oldName)) {
                System.out.print("Input new name: ");
                String newName = new Scanner(System.in).nextLine();
                names[i] = newName;
            }
        }
        System.out.println("Update new name");
        System.out.println(Arrays.toString(names));

    }
}
