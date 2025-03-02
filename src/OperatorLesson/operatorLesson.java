import java.util.Scanner;

public class operatorLesson {
    public static void main(String[] args) {
        System.out.print("[+] Insert your age: ");
        int age =new Scanner(System.in).nextInt();
        if(age>18){
            System.out.println("You're available for vote");
        }else{
            System.out.println("You're too young");
        }
    }
}