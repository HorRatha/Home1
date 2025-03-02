package Method;

import java.util.HashSet;

public class Exercise1 {
    public static void duplicateFinder(int [] array){
        HashSet <Integer> seen = new HashSet<>();
        for (int num : array) {
            if(!seen.add(num)){
                System.out.println("Duplicate: " + num);
            }
        }
    }

    public static void findDuplicate(int [] array){
        for (int i = 0; i < array.length; i++) {
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("Found Duplicated: " + array[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,9,3,5};
        duplicateFinder(array);
        findDuplicate(array);
    }
}
