import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner s = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter String : ");

        // Read the string entered by the user
        String str = s.next();

        // Start from the last index of the string
        int i = str.length() - 1;

        // Variable to store the reversed string
        String f = "";

        // Loop from the last character to the first character
        for (int j = i; j >= 0; j--) {

            // Get the character at index j
            char c = str.charAt(j);

            // Add the character to the reversed string
            f = f + c;
        }

        // Print the reversed string
        System.out.println(f);
    }
}
