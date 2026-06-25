import java.util.Scanner;

public class AverageofNnum {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int sum=0;
        int count =0;

        while (true) {
            System.out.print("Enter Number : ");
            int n = i.nextInt();

            if (n==0) {
                break;

            }
            count++;

            sum=sum+n;
        }
        int avg = sum/count;
        System.out.println("The avg of all number is : "+avg);
    }
}
