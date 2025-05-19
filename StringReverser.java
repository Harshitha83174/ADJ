package Lab3;
import java.util.Scanner;

public class StringReverser {

    // User-defined function to reverse a string
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string to reverse: ");
        String str = scanner.nextLine();

        // Call the reverseString function
        String reversed = reverseString(str);

        // Output
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}

