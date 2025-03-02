package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    private static Map<Integer, String> studentInfo = new HashMap<>();

    // Add a new student
    private static boolean addNewStudentName(String studentName) {
        int key = new Random().nextInt(999999); // Generate random ID
        studentInfo.put(key, studentName);
        return true;
    }

    // Remove a student by ID
    private static boolean removeStudentById(int id) {
        String value = studentInfo.remove(id);
        return value != null; // Return true if removed successfully, false otherwise
    }

    // Update a student's name by ID
    private static boolean updateStudentById(int id, String newName) {
        if(studentInfo.containsKey(id)) {
            studentInfo.put(id, newName);
            return true;
        }
        return false;
    }

    // Search for a student by ID
    private static String searchStudentById(int id) {
        return studentInfo.getOrDefault(id, null); // Return the student name if found, null otherwise
    }

    // Home menu
    private static void home() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1. Add Student Name
                    2. Search by ID
                    3. Delete Student by ID
                    4. Update Student by ID
                    5. Exit
                    """);
            System.out.print("Insert option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Insert student name to add record: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    boolean isInserted = addNewStudentName(name);
                    if (isInserted) {
                        System.out.println("Student added successfully!");
                        System.out.println("Current student records: " + studentInfo);
                    } else {
                        System.out.println("Failed to add student.");
                    }
                }
                case 2 -> {
                    System.out.print("Insert student ID to search: ");
                    int id = scanner.nextInt();
                    String studentName = searchStudentById(id);
                    if (studentName != null) {
                        System.out.println("Student found: " + studentName);
                    } else {
                        System.out.println("Student not found with ID: " + id);
                    }
                }
                case 3 -> {
                    System.out.print("Insert student ID to delete: ");
                    int id = scanner.nextInt();
                    boolean isDeleted = removeStudentById(id);
                    if (isDeleted) {
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("No student found with ID: " + id);
                    }
                    System.out.println("Current student records: " + studentInfo);
                }
                case 4 -> {
                    System.out.print("Insert student ID to update: ");
                    int id = scanner.nextInt();
                    System.out.print("Insert new student name: ");
                    scanner.nextLine(); // Consume newline
                    String newName = scanner.nextLine();
                    boolean isUpdated = updateStudentById(id, newName);
                    if (isUpdated) {
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("No student found with ID: " + id);
                    }
                    System.out.println("Current student records: " + studentInfo);
                }
                case 5 -> {
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        home();
    }
}