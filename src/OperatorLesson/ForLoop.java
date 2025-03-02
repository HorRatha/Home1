package OperatorLesson;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            try{
                Thread.sleep(300);
                System.out.println(" Hello World");
            }catch(Exception ignore){}
        }
    }
}
