public class CountDown {
    /**
     * Recursive method that counts down from a given number 'n' to 1,
     * and prints "Go!" when it reaches 0.
     * 
     * @param n The starting integer for the countdown
     */
    public static void count(int n) {
        // Base Case: Stops the recursion when n reaches 0.
        // Prevents infinite loops / StackOverflowError.
        if (n == 0) { 
            System.out.println("Go!"); 
            return; // Exit the method call
        }
        
        // Processing Step: Print the current number
        System.out.println(n);
        
        // Recursive Step: Call the count method again with (n - 1),
        // moving closer to the base case with each step.
        count(n - 1);
    }

    public static void main(String[] args) {
        // Start the countdown sequence from 5
        count(5);
    }
}
