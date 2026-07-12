import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the full price : ");
        double Price = i.nextDouble();
        System.out.print("Enter the Discount % : ");
        double Dis = i.nextDouble();

        double disamt = (Price*Dis)/100;
        double fp = Price-disamt;

        System.out.println("Your Discounted Price is : "+fp);
    }
}
