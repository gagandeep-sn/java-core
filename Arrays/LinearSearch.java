public class LinearSearch {

    /**
     * Performs a linear search to find the index of a target element in an array.
     * 
     * @param arr    The array of integers to search through.
     * @param target The value to search for.
     * @return The index of target if found; -1 otherwise.
     * 
     * Time Complexity: O(n) - worst case iterates through all n elements.
     * Space Complexity: O(1) - performs search in-place.
     */
    public static int search(int[] arr, int target) {
        // Iterate through each element in the array sequentially
        for (int i = 0; i < arr.length; i++) {
            // Check if current element matches the target
            if (arr[i] == target) {
                return i; // Target found, return its index
            }
        }
        
        // Target was not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        
        // Output will be 3 (since 8 is at index 3)
        System.out.println(search(arr, 8));
    }
}
