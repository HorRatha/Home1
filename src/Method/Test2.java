package Array;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    private static final String RED = "\u001B[31m"; // Red color ANSI code
    private static final String RESET = "\u001B[0m"; // Reset color ANSI code
    private static String[][] hall;
    private static ArrayList<String> history = new ArrayList<>();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Cinema Hall Booking System ---");
            System.out.println("1. Set up hall");
            System.out.println("2. Start booking");
            System.out.println("3. Cancel booked seat");
            System.out.println("4. View History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    setupHall(scanner);
                    break;
                case 2:
                    startBooking(scanner);
                    break;
                case 3:
                    cancelBooking(scanner);
                    break;
                case 4:
                    viewHistory();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to set up the hall
    private static void setupHall(Scanner scanner) {
        System.out.print("[+] Insert number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("[+] Insert number of columns: ");
        int columns = scanner.nextInt();
        hall = new String[rows][columns];

        char characterSeat = 'A';
        int seatCode = 1;

        for (int i = 0; i < hall.length; i++) {
            seatCode = 1;
            for (int j = 0; j < hall[i].length; j++) {
                hall[i][j] = characterSeat + "-" + seatCode + " :AV";
                seatCode++;
            }
            characterSeat++;
        }
        System.out.println("Hall has been set up successfully!");
        displayHall();
    }

    // Method to book a seat
    private static void startBooking(Scanner scanner) {
        if (hall == null) {
            System.out.println("Hall is not set up. Please set up the hall first.");
            return;
        }

        displayHall();
        System.out.print("[+] Insert seat code to book (e.g., A-1): ");
        String code = scanner.next().trim();
        boolean isFound = false;

        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                String[] splitCode = hall[i][j].split(":");
                if (splitCode[0].trim().equalsIgnoreCase(code)) {
                    isFound = true;
                    if (splitCode[1].trim().equalsIgnoreCase("BO")) {
                        System.out.println("This seat is already booked!");
                        return;
                    }
                    hall[i][j] = splitCode[0] +":BO";
                    String timestamp = LocalDateTime.now().format(formatter);
                    history.add("Booked Seat: " + code + " at " + timestamp);
                    System.out.println("Seat " + code + " has been booked successfully on " + timestamp + "!");
                }
            }
        }

        if (!isFound) {
            System.out.println("Seat code not found.");
        }

        displayHall();
    }

    // Method to cancel a booked seat
    private static void cancelBooking(Scanner scanner) {
        if (hall == null) {
            System.out.println("Hall is not set up. Please set up the hall first.");
            return;
        }

        displayHall();
        System.out.print("[+] Insert seat code to cancel booking (e.g., A-1): ");
        String code = scanner.next().trim();
        boolean isFound = false;

        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                String[] splitCode = hall[i][j].split(":");
                if (splitCode[0].trim().equalsIgnoreCase(code)) {
                    isFound = true;
                    if (splitCode[1].trim().equalsIgnoreCase("AV")) {
                        System.out.println("This seat is not booked yet!");
                        return;
                    }
                    hall[i][j] = splitCode[0] + ":AV";
                    String timestamp = LocalDateTime.now().format(formatter);
                    history.add("Cancelled Booking: " + code + " at " + timestamp);
                    System.out.println("Booking for seat " + code + " has been cancelled successfully on " + timestamp + "!");
                }
            }
        }

        if (!isFound) {
            System.out.println("Seat code not found.");
        }

        displayHall();
    }

    // Method to view booking history
    private static void viewHistory() {
        if (history.isEmpty()) {
            System.out.println("No booking or cancellation history yet.");
            return;
        }

        System.out.println("\n--- Booking and Cancellation History ---");
        for (String record : history) {
            System.out.println(record);
        }
    }

    // Method to display the hall
    private static void displayHall() {
        if (hall == null) {
            System.out.println("Hall is not set up.");
            return;
        }

        System.out.println("\n--- Hall Layout ---");
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                String seat = hall[i][j];
                if (seat.contains(":BO")) {
                    // Display "BO" in red
                    seat = seat.replace(":BO", ":" + RED +"BO" + RESET);
                }
                System.out.print(seat + " | ");
            }
            System.out.println();
        }
    }
}