package Array;

import java.util.Arrays;

public class TestIndexArray {
    public static void main(String[] args) {
        String[] array = new String[4];
        array[0] = "A";
        array[1] = "B";
//        array[2] = "C";
        array[3] = "D";
        System.out.println(Arrays.toString(array));
        System.out.println("Array Size: " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println("This is count: " + array[i]);
        }
    }
}
