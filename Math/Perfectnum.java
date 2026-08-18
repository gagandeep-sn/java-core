import java.util.Scanner;

public class Perfectnum {
    public static void main(String[] args) {

        // Take input from user
        System.out.print("Enter the num : ");
        Scanner i = new Scanner(System.in);
        int num = i.nextInt();

        // Store sum of factors
        int sum = 0;

        // Find all proper factors of num
        for (int j = 1; j < num; j++) {

            // If j divides num completely, it is a factor
            if (num % j == 0) {
                sum += j;
            }
        }

        // Check whether sum of factors equals the number
        if (num == sum) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
