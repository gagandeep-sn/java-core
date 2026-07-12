import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        System.out.print("Enter the Principal Amount: ");
        Scanner i =new Scanner(System.in);
        int p = i.nextInt();

        System.out.print("Enter the Time in years: ");
          int t = i.nextInt();

        System.out.print("Enter the Rate : ");
          double r = i.nextDouble();
          double r2 =r/100;

        double compoundIntrest = p*(Math.pow((1+r2),t));

        System.out.printf("Your compound intrest is : %.2f",compoundIntrest);

    }
}
