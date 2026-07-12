import java.util.Scanner;

public class CalculateCommisionPercentage {
    public static void main(String[] args) {
        System.out.print("Enter The Sales Amount : ");
        Scanner i = new Scanner(System.in);
        double Sale = i.nextDouble();
        System.out.print("Enter commision earned : ");
        double Comission = i.nextDouble();
        double comper= (Comission/Sale)*100;

        System.out.println("The Commission Percentage is : "+ comper+"%");



    }
}
