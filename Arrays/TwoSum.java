import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        // Input array
        int[] nums = {2, 7, 11, 15};

        // Target sum
        int target = 9;

        // Array to store the indices of the two numbers
        int[] ans = new int[2];

        // Select the first number
        for (int i = 0; i < nums.length; i++) {

            // Select the second number after the first number
            for (int j = i + 1; j < nums.length; j++) {

                // Calculate the sum of both numbers
                int sum = nums[i] + nums[j];

                // Check if the sum is equal to the target
                if (sum == target) {

                    // Store the indices of the two numbers
                    ans[0] = i;
                    ans[1] = j;

                    // Print the result
                    System.out.println(Arrays.toString(ans));

                    // Stop the program after finding the answer
                    return;
                }
            }
        }
    }
}
