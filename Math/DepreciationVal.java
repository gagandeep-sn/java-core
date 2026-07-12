import java.util.Scanner;

public class DepreciationVal {
    public static void main(String[] args) {
        Scanner i =new Scanner(System.in);
        System.out.print("Enter the Price Paid : ");
        double p = i.nextDouble();
        System.out.print("Enter the Time in Years: ");
        double t = i.nextDouble();
        System.out.print("Enter the Dep rate : ");
        double d = i.nextDouble();
        double I;
        double n=0;
        double r=p;

        while (t!=0){
              I = (r*d)/100;
              r= r - I;
              t--;
        }

        System.out.println("The depreciating value is : "+ r );

    }
}
