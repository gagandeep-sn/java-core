import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter the Num : ");
        Scanner i = new Scanner(System.in);
        int num= i.nextInt();
        int sum=0;
         while(num!=0) {
             int c=num%10;
             sum +=c;
             num=num/10;

         }
        System.out.println(sum);

    }
}
