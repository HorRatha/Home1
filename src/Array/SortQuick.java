package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortQuick {
    public static void main(String[] args) {
        int [] numbers = {-1,-2,-3,3,2,1};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        List<Integer> integerList = new ArrayList<>();
        Arrays.stream(numbers).forEach(e->{
            integerList.add(e);
        });
        Collections.reverse(integerList);
        System.out.println(integerList);

    }
}
