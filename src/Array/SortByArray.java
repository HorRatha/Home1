package Array;

import java.util.Arrays;

public class SortByArray {
    public static void main(String[] args) {
        int[] array = { -2,-4,-5,5,6,3 };
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
