import java.util.Scanner;

public class InputUntil0 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int sum=0;

        while (true) {
            System.out.print("Enter Number : ");
            int n = i.nextInt();

            if (n==0) {
                break;

            }

           sum=sum+n;
        }
        System.out.println("The sum of all number is : "+sum);
    }
}
