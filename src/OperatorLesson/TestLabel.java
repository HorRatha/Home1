package OperatorLesson;

public class TestLabel {
    public static void main(String[] args){
        myLabel:
        for(int k=0;k<10;k++){
            for(int i=1;i<10;i++){
                if(i%2==0){
                    break myLabel;
                }
                System.out.println(k + "=> " + i);
            }
        }

    }
}
