import java.util.Arrays;  // Imports Arrays class to print the array easily

public class SuffleTheArray {

    public static void main(String[] args) {

        // Original array
        int[] nums = {1, 2, 3, 4, 5, 6};

        // Find the size of each half of the array
        // nums.length = 6, so n = 3
        int n = nums.length / 2;

        // Pointer for the first half
        int first = 0;

        // Pointer for the second half
        int second = n;

        // Create a new array to store the shuffled result
        int[] ans = new int[nums.length];

        // Pointer for inserting elements into ans[]
        int next = 0;

        // Loop through the first half of the array
        for (int i = 0; i < n; i++) {

            // Take an element from the first half
            ans[next] = nums[first];

            // Move to the next position in ans[]
            next++;

            // Move to the next element of the first half
            first++;

            // Take an element from the second half
            ans[next] = nums[second];

            // Move to the next position in ans[]
            next++;

            // Move to the next element of the second half
            second++;
        }

        // Print the shuffled array
        System.out.println(Arrays.toString(ans));
    }
}
