package OperatorLesson;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException {
        int i=0;
        while (i<10){
            System.out.println("Hello [" + i + "]");
            Thread.sleep(500);
            i++;
        }
    }
}
