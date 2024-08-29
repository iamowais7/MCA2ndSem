import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProductDetails {

    // Define a file name to store product data
    private static final String FILE_NAME = "product_data.txt";

    // Product class to represent product data
    static class Product {
        String productCode;
        double cost;
        int numberOfItemsAvailable;

        public Product(String productCode, double cost, int numberOfItemsAvailable) {
            this.productCode = productCode;
            this.cost = cost;
            this.numberOfItemsAvailable = numberOfItemsAvailable;
        }

        @Override
        public String toString() {
            return productCode + "," + cost + "," + numberOfItemsAvailable;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold details of five products
        Product[] products = new Product[5];

        // Get details about five products from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");
            System.out.print("Enter product code: ");
            String productCode = scanner.nextLine();

            System.out.print("Enter product cost: ");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter number of items available: ");
            int numberOfItemsAvailable = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Create a product object and add it to the array
            products[i] = new Product(productCode, cost, numberOfItemsAvailable);
        }

        // Write product data to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Product product : products) {
                writer.write(product.toString());
                writer.newLine();
            }
            System.out.println("Product data saved to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing data to the file: " + e.getMessage());
        }

        scanner.close();
    }
}
