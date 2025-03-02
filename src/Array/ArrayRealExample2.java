package Array;

import java.util.Scanner;

public class ArrayRealExample2 {
    // ANSI color codes for console formatting
    private static final String RESET = "\u001B[0m";    // Reset color
    private static final String RED_BG = "\u001B[41m"; // Red background (for booked seats)
    private static final String GREEN_BG = "\u001B[42m"; // Green background (for available seats)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get hall dimensions
        System.out.print("[+] Insert number of rows: ");
        int rowNumber = scanner.nextInt();
        System.out.print("[+] Insert number of columns: ");
        int columnNumber = scanner.nextInt();

        // Initialize hall array
        String[][] hall = new String[rowNumber][columnNumber];

        // Generate seat codes (A-1, A-2, B-1, B-2, etc.)
        char characterSeat = 'A';
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                hall[i][j] = characterSeat + "-" + (j + 1) + " :AV"; // "AV" means Available
            }
            characterSeat++;
        }

        // Booking loop (Runs until user types "exit")
        while (true) {
            // Display current seat availability with colors
            displayHall(hall);

            // Ask user for seat to book
            System.out.print("[+] Insert seat code to book (e.g., A-1, B-2) or type 'exit' to quit: ");
            String code = scanner.next().trim();

            // Exit condition
            if (code.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the booking system!");
                break;
            }

            // Process seat booking attempt
            boolean seatFound = false;
            for (int i = 0; i < hall.length; i++) {
                for (int j = 0; j < hall[i].length; j++) {
                    String[] splitCode = hall[i][j].split(" :"); // Split into ["A-1", "AV"]
                    if (splitCode[0].equalsIgnoreCase(code)) {
                        seatFound = true;
                        if (splitCode[1].equals("AV")) { // If seat is available
                            hall[i][j] = splitCode[0] + " :BO"; // Mark as Booked
                            System.out.println("[✔] Seat " + code + " has been successfully booked.");
                        } else {
                            System.out.println("[✘] The seat " + code + " is already booked!");
                        }
                        break;
                    }
                }
                if (seatFound) break;
            }

            // If the seat code was not found
            if (!seatFound) {
                System.out.println("[✘] Invalid seat code! Please try again.");
            }
        }

        scanner.close();
    }

    // Function to display the seating arrangement with colors
    private static void displayHall(String[][] hall) {
        System.out.println("\n[ Current Seating Arrangement ]");
        for (String[] row : hall) {
            System.out.print("| ");
            for (String seat : row) {
                String[] splitSeat = seat.split(" :");
                String seatCode = splitSeat[0]; // Example: "A-1"
                String status = splitSeat[1]; // Example: "AV" or "BO"

                // Apply color based on seat status
                if (status.equals("AV")) {
                    System.out.print(GREEN_BG + seatCode + " :" + status + RESET + " | ");
                } else {
                    System.out.print(RED_BG + seatCode + " :" + status + RESET + " | ");
                }
            }
            System.out.println();
        }
    }
}