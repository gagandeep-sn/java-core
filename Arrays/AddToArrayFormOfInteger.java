import java.util.ArrayList;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k=85;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {

            int sum = num[i] + k;

            ans.add(0, sum % 10);

            k = sum / 10;
        }

        while (k > 0) {
            ans.add(0, k % 10);
            k /= 10;
        }

        System.out.println(ans);
    }
}
