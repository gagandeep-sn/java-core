public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int[] ans =new int[nums.length];
        ans[0]=nums[0];
        for (int i = 1; i < nums.length ; i++) {
            ans[i]=nums[i]+ans[i-1];

        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");

        }

    }
}
