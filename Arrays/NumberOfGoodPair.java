public class NumberOfGoodPair {
    public static void main(String[] args) {

        // Create an array of numbers
        int[] num = {1, 2, 3, 1, 1, 3};

        // Variable to store the number of good pairs
        int count = 0;

        // Outer loop selects the first element of the pair
        for (int i = 0; i < num.length; i++) {

            // Inner loop selects the second element
            // Start from i + 1 so we don't compare the same pair twice
            for (int j = i + 1; j < num.length; j++) {

                // Check if both numbers are equal
                // If equal, they form a good pair
                if (num[i] == num[j]) {
                    count++;
                }
            }
        }

        // Print the total number of good pairs
        System.out.println("The Number of good pair is : " + count);
    }
}
