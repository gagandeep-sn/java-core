import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        System.out.println("Enter the num :  ");
        Scanner i = new Scanner(System.in);
        int num = i.nextInt();
        System.out.println("The factorial of num : "+num+" is "+factorial(num));

    }
    static int factorial(int n) {
        int fac= n;
        if (n==1) {
            fac=1;
        }
        for (int i=n-1; i>0; i--) {
            fac = fac * i;

        }
        return fac;

    }
}
