public class FindGcdOfArray {
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

        while (min != 0)
        {
            int temp = min;
            min = max % min;
            max = temp;
        }

        System.out.println("The GCD of max and min is : "+max);

    }
}
