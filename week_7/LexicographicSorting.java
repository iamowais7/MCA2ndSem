import java.util.Arrays;
import java.util.Scanner;

public class LexicographicSorting {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read three strings from the user
        System.out.println("Enter three strings:");
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Sort the strings lexicographically
        Arrays.sort(strings);

        // Print the sorted strings
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
