import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter first num :");
        int a = i.nextInt();

        System.out.print("Enter first num 2:");
        int b = i.nextInt();

        int sum = a+b;
        int prd = a*b;
        int ans =prd-sum;

        System.out.println("The Diferrence of product "+prd+" and sum "+sum+" of the number is " +ans);

    }
}
