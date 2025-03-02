package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeworkFrame {
    private static ArrayList<String> productNames = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n*** Product Management System ***");
            System.out.println("1. Add New Product");
            System.out.println("2. Search Product by Name");
            System.out.println("3. Update Product by Name");
            System.out.println("4. Delete Product by Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    searchProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Display the current list of products
            displayProducts();
        }
    }

    // Method to add a new product
    private static void addProduct() {
        System.out.print("Enter product name to add: ");
        String newProduct = scanner.nextLine();
        productNames.add(newProduct);
        System.out.println("Product added successfully!");
    }

    // Method to search for a product
    private static void searchProduct() {
        System.out.print("Enter product name to search: ");
        String searchProduct = scanner.nextLine();
        if (productNames.contains(searchProduct)) {
            System.out.println("Product found: " + searchProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to update a product
    private static void updateProduct() {
        System.out.print("Enter product name to update: ");
        String oldProduct = scanner.nextLine();
        int indexToUpdate = productNames.indexOf(oldProduct);
        if (indexToUpdate >= 0) {
            System.out.print("Enter new product name: ");
            String updatedProduct = scanner.nextLine();
            productNames.set(indexToUpdate, updatedProduct);
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to delete a product
    private static void deleteProduct() {
        System.out.print("Enter product name to delete: ");
        String deleteProduct = scanner.nextLine();
        if (productNames.remove(deleteProduct)) {
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to display all products
    private static void displayProducts() {
        System.out.println("\nCurrent Product List:");
        if (productNames.isEmpty()) {
            System.out.println("No products available.");
        } else {
            productNames.forEach(product -> System.out.println("- " + product));
        }
    }
}