package Array;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class HomeworkArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productName = new String[30];

        System.out.println("=".repeat(30));
        System.out.println("🛒 Product Stock Management System");
        System.out.println("=".repeat(30));

        while (true) {
            System.out.println("""
                1. List all Products
                2. Create new Product
                3. Update Product
                4. Delete Product
                5. Exit
                ----------------------------------
                """);
            System.out.print("[+] Insert option: ");

            int opt;
            if (scanner.hasNextInt()) {
                opt = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } else {
                System.out.println("❌ Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            switch (opt) {
                case 1 -> {
                    System.out.println("==> 📜 List of Products:");
                    boolean hasProducts = false;
                    for (String p : productName) {
                        if (p != null) {
                            System.out.println("- " + p);
                            hasProducts = true;
                        }
                    }
                    if (!hasProducts) {
                        System.out.println("⚠️ No products found.");
                    }
                }
                case 2 -> {
                    System.out.print("[+] Enter Product Name: ");
                    String productN = scanner.nextLine().trim();
                    if (productN.isEmpty()) {
                        System.out.println("⚠️ Product name cannot be empty!");
                        continue;
                    }
                    boolean added = false;
                    for (int i = 0; i < productName.length; i++) {
                        if (productName[i] == null) {
                            productName[i] = productN;
                            added = true;
                            break;
                        }
                    }
                    if (added) {
                        System.out.println("✅ Product added successfully!");
                        System.out.println("📅 Created at " + Date.from(Instant.now()));
                    } else {
                        System.out.println("❌ Product list is full!");
                    }
                }
                case 3 -> { // Update Product
                    System.out.print("[+] Enter the product name to update: ");
                    String oldName = scanner.nextLine().trim();
                    boolean found = false;
                    for (int i = 0; i < productName.length; i++) {
                        if (productName[i] != null && productName[i].equalsIgnoreCase(oldName)) {
                            System.out.print("[+] Enter new product name: ");
                            String newName = scanner.nextLine().trim();
                            if (!newName.isEmpty()) {
                                productName[i] = newName;
                                System.out.println("✅ Product updated successfully!");
                                System.out.println("📅 Updated at " + Date.from(Instant.now()));
                                found = true;
                                break;
                            } else {
                                System.out.println("⚠️ Product name cannot be empty!");
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("⚠️ Product not found!");
                    }
                }
                case 4 -> { // Delete Product
                    System.out.print("[+] Enter the product name to delete: ");
                    String deleteName = scanner.nextLine().trim();
                    boolean deleted = false;
                    for (int i = 0; i < productName.length; i++) {
                        if (productName[i] != null && productName[i].equalsIgnoreCase(deleteName)) {
                            productName[i] = null;
                            deleted = true;
                        }
                    }
                    if (deleted) {
                        System.out.println("🗑️ Product deleted successfully!");
                        System.out.println("📅 Deleted at " + Date.from(Instant.now()));
                    } else {
                        System.out.println("⚠️ Product not found!");
                    }
                }
                case 5 -> { // Exit
                    System.out.println("👋 Exiting Product Stock Management System... Goodbye!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("⚠️ Invalid option! Please select a valid option.");
            }

            System.out.print(">> Press Enter to continue...");
            scanner.nextLine();
        }
    }
}