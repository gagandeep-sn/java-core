public class PermutationArray {
    public static void main(String[] args) {
        int[] num = {3,0,4,1,2};
        int[] ans =new int[5];
        for (int i = 0; i < num.length; i++) {
            ans[i]=num[num[i]];
        }
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i] +" ");

        }


    }
}
