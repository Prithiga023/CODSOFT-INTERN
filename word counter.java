import java.util.Scanner;

public class AnotherWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text or provide a file path: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+"); // Splitting by spaces

        int wordCount = words.length;

        System.out.println("Total word count: " + wordCount);

        // Additional features can be added here, such as ignoring common words,
        // calculating unique word count, word frequency, and implementing input validation.

        scanner.close();
    }
}