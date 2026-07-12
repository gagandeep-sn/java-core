import java.util.Scanner;

public class TakeNumTill0andFindLargest {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int max=0;

        while (true) {

            System.out.print("Enter Number : ");
            int n = i.nextInt();
            if(max<n) {
                max=n;

            }

            if (n==0) {
                break;
            }

        }
        System.out.println(max);

    }
}

