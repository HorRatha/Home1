package Method;

public class Array {
    public static void sumOfIntegerArray(int [] array){
        int sum = 0;
        for (int a: array){
            sum+=a;
        }
        System.out.println("Sum of array= " + sum);
    }

    public static void main(String[] args) {
        sumOfIntegerArray(new int[]{1,2,3});
    }

}
