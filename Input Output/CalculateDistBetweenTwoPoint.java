import java.util.Scanner;

public class CalculateDistBetweenTwoPoint {
    public static void main(String[] args) {
        System.out.print("Enter x1 : ");
        Scanner i = new Scanner(System.in);
        double x1 = i.nextDouble();
        System.out.print("Enter y1 : ");
        double y1 = i.nextDouble();

        System.out.print("Enter x2 : ");
        double x2 = i.nextDouble();
        System.out.print("Enter y2 : ");
        double y2 = i.nextDouble();

        double dist= Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        System.out.println("The Distance between two point is :"+dist);


    }
}
