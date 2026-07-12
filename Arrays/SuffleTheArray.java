import java.util.Arrays;

public class SuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int n = nums.length/2;
        int first =0;
        int second =n;
        int[] ans = new int[nums.length];
        int next =0;

        for (int i = 0; i < n; i++) {
            ans[next]=nums[first];
            next++;
            first++;
            ans[next]=nums[second];
            next++;
            second++;
        }
        System.out.println(Arrays.toString(ans));

    }
}
