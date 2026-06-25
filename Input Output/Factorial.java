import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner i= new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int n = i.nextInt();
        int fac=1;
        while (n!=0) {

          fac = fac*n;

           n--;

        }
        System.out.println(fac);
    }
}
