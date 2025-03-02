package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class FirstMarch {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>(List.of(1,2,4,5));
        List<Integer> integerList
                = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(integerList.size());// check size of arrayList
        //
        integerList.remove(0);
        //
        integerList.set(1,100);
        //clear all elements from arraylist
        integerList.clear();
        integerList.removeIf(e->e.equals(100));// remove with condition
        integerList.removeFirst();
        // check if two or more lists have the same value
        integerList.containsAll(originalList);
        // check single element if existed in the list
        boolean isExisted = integerList.contains(90);
        // get element from list by using index
        Integer element = integerList.get(0);
        integerList.getFirst();
        // check if list contain element
        integerList.isEmpty();
        // find index of element inside list
        int index = integerList.indexOf(5);
        // reverse element inside the list
        integerList.reversed();
    }
}
