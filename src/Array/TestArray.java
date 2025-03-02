package Array;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        String[] array = new String[]{"Math","English", "Mala" };
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println();
        String[] names = { "Math", "English", "Mala" };
        for (String name : names) {
            System.out.println(name);
        }

    }
}
