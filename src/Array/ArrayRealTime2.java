package Array;

import java.util.Scanner;

public class ArrayRealTime2 {
    private static final String RED_BG = "\u001B[41m"; // Red background color
    private static final String RESET = "\u001B[0m";   // Reset color
    private static final String White = "\u001B[37m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[+] Insert number of rows: ");
        int rowNumber = scanner.nextInt();
        System.out.print("[+] Insert number of columns: ");
        int columnNumber = scanner.nextInt();

        String[][] hall = new String[rowNumber][columnNumber];

        char characterSeat = 'A';
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                hall[i][j] = characterSeat + "-" + (j + 1) + " :AV";
            }
            characterSeat++;
        }

        while (true) {
            // Display the seating arrangement
            System.out.println("\n[ Current Seating Arrangement ]");
            for (int i = 0; i < hall.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < hall[i].length; j++) {
                    if (hall[i][j].endsWith(":BO")) {
                        // Highlight booked seats with a red background
                        String[] splitSeat = hall[i][j].split(" :");
                        System.out.print(splitSeat[0] + " :" + RED_BG + White +"BO" + RESET + " | ");
                    } else {
                        System.out.print(hall[i][j] + " | ");
                    }
                }
                System.out.println();
            }

            // Booking logic
            System.out.print("[+] Insert seat code to book (e.g., A-1, B-2) or type 'exit' to quit: ");
            String code = scanner.next().trim();
            if (code.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the booking system!");
                break;
            }

            boolean seatFound = false;
            for (int i = 0; i < hall.length; i++) {
                for (int j = 0; j < hall[i].length; j++) {
                    String[] splitCode = hall[i][j].split(" :");
                    if (splitCode[0].equalsIgnoreCase(code)) {
                        seatFound = true;
                        if (splitCode[1].equals("AV")) {
                            hall[i][j] = splitCode[0] + " :BO";
                            System.out.println("[✔] Seat " + code + " has been successfully booked.");
                        } else {
                            System.out.println("[✘] The seat " + code + " is already booked!");
                        }
                        break;
                    }
                }
                if (seatFound) break;
            }

            if (!seatFound) {
                System.out.println("[✘] The seat is not found.");
            }
        }

        scanner.close();
    }
}