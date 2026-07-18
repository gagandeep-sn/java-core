// This is Brute Force method Not suitable for larger number

public class FInd_Greatest_Common_Divisor_Of_Array {
    public static void main(String[] args) {
        int[] nums = {12, 18, 27};
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }

            if (max < nums[i]) {
                max = nums[i];

            }

        }
        int gcd = 0;

    // Here i am calculating factor of minimum number from 1 to min.
        for (int i = 1; i <= min; i++) {
            // Min is too big  it is going to  run for so long
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }

        }
        System.out.println("GCD of Max and Min is : " + gcd);

    }
}
