import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCounter {

    public static void main(String[] args) {
        // Check if a file path is provided as an argument
        if (args.length == 0) {
            System.out.println("Please provide a file path as an argument.");
            return;
        }

        // Get the file path from the command line arguments
        String filePath = args[0];

        // Create a File object
        File file = new File(filePath);

        // Initialize character count to zero
        int characterCount = 0;

        // Try-with-resources statement to automatically close the FileReader
        try (FileReader fileReader = new FileReader(file)) {
            // Read characters from the file
            int character;
            while ((character = fileReader.read()) != -1) {
                // Increment the character count for each character read
                characterCount++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }

        // Print the character count
        System.out.println("The file contains " + characterCount + " characters.");
    }
}
