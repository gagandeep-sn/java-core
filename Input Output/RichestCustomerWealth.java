import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr= {
                {1,4,3},
                {4,3,2},
                {5,2,3}
        };
        int richestCustomer=0;
        for (int row = 0; row < arr.length; row++) {
            int sum=0;

            for (int col = 0; col < arr[row].length; col++) {
                sum +=arr[row][col];

            }
            if (sum>richestCustomer) {
                richestCustomer=sum;
            }

        }

        System.out.println(richestCustomer);
    }
}
