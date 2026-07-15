import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        // Start from the rightmost digit (least significant)
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment and return!
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, it becomes 0 (and we carry the 1 to the next loop iteration)
            digits[i] = 0;
        }

        // If the loop finished, it means ALL digits were 9 (e.g., 999 -> 1000)
        // We need a new array that is 1 element larger.
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1; // The rest defaults to 0 in Java automatically
        return newArray;
    }
}