public class ConcatenationOfArray {
    public static void main(String[] args) {
        // Input array
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        
        // Create an output array of double length (2 * n)
        // For an input of size 4, ans will have a size of 8
        int[] ans = new int[2 * n];

        // Fill both halves of the target array in a single loop
        for (int i = 0; i < nums.length; i++) {
            // Place the element in the first half (indices 0 to n-1)
            ans[i] = nums[i];
            
            // Place the same element in the second half (indices n to 2n-1)
            ans[i + n] = nums[i];
        }

        // Print the concatenated array to the console
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
