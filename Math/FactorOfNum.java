import java.util.Scanner;

public class FactorOfNum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        System.out.print("Enter Num : ");
        Scanner i = new Scanner(System.in);

        // Read the target number from user input
        int n = i.nextInt();
        
        // Initialize loop variables:
        // 'c' represents the candidate divisor (starts at 1 and goes up to 'n')
        // 'z' represents the factor counter (tracks total factors found so far)
        int c = 1;
        int z = 1;

        // Loop through all numbers from 1 to 'n'
        while (c <= n) {

            // Check if 'c' divides 'n' completely without leaving a remainder
            if (n % c == 0) {
                // 'c' is a factor; print the factor number and its value
                System.out.println("Factor " + z + " is " + c);
                z++; // Increment the factor counter
            }
            
            c++; // Increment candidate divisor to test the next number
        }

        // Close the scanner object to prevent resource leaks
        i.close();
    }
}
