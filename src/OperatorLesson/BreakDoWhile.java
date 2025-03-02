package OperatorLesson;

public class BreakDoWhile {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        do {
            Thread.sleep(100);
            System.out.println("I vallue [" + i + "] ");
            i++;
            if (i == 10) {
                break;
            }
        }while (i>0);
    }
}
