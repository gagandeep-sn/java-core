import java.util.Scanner;

public class Perfectnum {
    public static void main(String[] args) {
        System.out.print("Enter the num : ");
        Scanner i = new Scanner(System.in);
        int num = i.nextInt();
         int fac=0;
         int sum=0;
        for (int j = 1; j < num; j++) {

            if(num%j==0) {
                fac=j;
                sum +=fac;

            }

        }
        if(num==sum) {
            System.out.println(num+" is a perfect number.");

        } else {
            System.out.println(num+" is not a perfect number.");
        }
    }

}
