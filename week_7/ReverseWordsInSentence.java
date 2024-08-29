import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Print the sentence with reversed words
        System.out.println("Reversed words in the original order: " + reverseWord(sentence));
    }

    public static String reverseWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word
            String reversedWord = new StringBuilder(word).reverse().toString();
            // Append reversed word to the result
            result.append(reversedWord);
            // Append space to separate words
            result.append(" ");
        }

        return result.toString().trim(); // Trim leading/trailing spaces before returning
    }
}
