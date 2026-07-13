public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maximum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            maximum = Math.max(sum, maximum);
            if (sum < 0) {
                sum = 0;

            }
        }
        System.out.println("The Maximum Sum of Subarray is : " + maximum);
    }

}
