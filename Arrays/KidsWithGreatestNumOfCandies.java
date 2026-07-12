import java.util.Arrays;

public class KidsWithGreatestNumOfCandies {
    public static void main(String[] args) {
        int[] kidWithCandies={2,3,4,5,1,3};
        int extraCandies=3;
        int max=0;
        boolean[] ans = new boolean[kidWithCandies.length];
        for (int i = 0; i <kidWithCandies.length ; i++) {
            int temp=kidWithCandies[i];
            if (temp>=max) {
                max=temp;
            }


        }
        for (int i = 0; i < kidWithCandies.length; i++) {
            int temp=kidWithCandies[i]+extraCandies;
              if (temp>=max) {
                  ans[i]=true;
              } else {
                  ans[i]=false;

              }

        }
        System.out.println(Arrays.toString(ans));

    }
}
