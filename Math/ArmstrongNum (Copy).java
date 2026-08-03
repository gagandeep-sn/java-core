import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        // Read input from the user
        System.out.print("Enter Num : ");
        Scanner i = new Scanner(System.in);
        int num = i.nextInt();

        int count = 0; // Stores the total number of digits
        int sum = 0;   // Accumulates the sum of each digit raised to power of 'count'
        
        // Preserve the original number for separate loops
        int temp = num;  // Used for counting total digits
        int temp2 = num; // Used for calculating digit powers

        // Step 1: Count the total number of digits in the input number
        while (temp != 0) {
            temp = temp / 10; // Remove the last digit
            count++;          // Increment digit count
        }

        // Step 2: Extract each digit and calculate (digit ^ count)
        while (temp2 != 0) {
            int c = temp2 % 10;                // Extract the last digit
            int next = (int) Math.pow(c, count); // Raise digit to the power of 'count'
            temp2 = temp2 / 10;               // Remove the last digit
            sum = sum + next;                 // Add result to total sum
        }

        // Step 3: Check if the calculated sum matches the original number
        if (sum == num) {
            System.out.println(num + " is Armstrong number.");
        } else {
            System.out.println("Not Armstrong Num.");
        }

        // Close scanner resource to prevent memory leaks
        i.close();
    }
}
