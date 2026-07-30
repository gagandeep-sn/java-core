import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}