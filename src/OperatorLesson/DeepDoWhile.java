package OperatorLesson;

public class DeepDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            i++;
            if (i == 10) {
                continue;
            }
            System.out.println("This is number" + i);
            if (i == 20) {
                break;
            }
        }while (i > 0);
    }
}
