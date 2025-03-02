package Array;

import java.util.Scanner;

public class ArrayRealExample {
    public static void main(String[] args) {

        //

        //
        System.out.print("[+] Insert number of row: ");
        int rowNumber = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert number of column: ");
        int columnNumber = new Scanner(System.in).nextInt();
        String [][]  hall = new String[rowNumber][columnNumber];
        // generate seat code
        char characterSeat = 'A';
        int seatCode = 1;
        //
        for(int i=0;i<hall.length;i++){
            seatCode=1;
            for(int j=0;j<hall[i].length;j++){
                hall[i][j] = characterSeat + "-" + seatCode + " :AV";
                seatCode++;
            }
            characterSeat++;
        }
        // while loop
        while (true){
            // showing hall
            for(int i=0;i<hall.length;i++){
                for(int j=0;j<hall[i].length;j++){
                    if(j==0){
                        System.out.print("| ");
                    }
                    System.out.print(hall[i][j] + " | ");
                }
                System.out.println();
            }
            // start booking
            System.out.print("[+] Insert seat code to book (A-1, B-1): ");
            String code = new Scanner(System.in).nextLine();
            code = code.trim();
            // start checking entered seat code
            boolean isFoundSeat = false;
            for(int i=0;i<hall.length;i++){
                for(int j=0;j<hall[i].length;j++){
                    String [] splitCode = hall[i][j].split(":");
                    if(splitCode[0].trim().equalsIgnoreCase(code)){
                        isFoundSeat = true;
                        if(splitCode[1].trim().equalsIgnoreCase("BO")){
                            System.out.print("This seat has been booked 🔥");
                            System.exit(0);
                        }
                        hall[i][j] = splitCode[0] + ":BO";
                    }
                }
            }
            if(!isFoundSeat){
                System.out.println("Seat you booked hasn't been found :( ");
                System.exit(0);
            }
            // showing hall
            for(int i=0;i<hall.length;i++){
                for(int j=0;j<hall[i].length;j++){
                    if(j==0){
                        System.out.print("| ");
                    }
                    System.out.print(hall[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.print(">> Press any key to continue");
            new Scanner(System.in).nextLine();
        }

    }
}
