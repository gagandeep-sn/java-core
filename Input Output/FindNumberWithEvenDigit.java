public class FindNumberWithEvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,0,6,7898};
        int ans = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count=0;
            int temp=nums[i];

            if (temp==0) {
                count++;

            } else {
                while (temp > 0) {
                    temp = temp / 10;
                    count++;
                }
            }
            if (count%2==0) {
                ans++;

            }

        }
        System.out.println("The number of even digits are : " +ans);
    }
}
