import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
//        AREA OF CIRCLE
//        System.out.print("Enter the Radius of circle in cm : ");
//        double r = i.nextDouble();
//        double Area = 3.14*r*r;
//        System.out.println("Area of Circle is : " + Area);

//         *** AREA OF TRIANGLE***
//        System.out.print("Enter Lenght : ");
//        double l = i.nextDouble();
//        System.out.print("Enter Height : ");
//        double b = i.nextDouble();
//          double area = .5*l*b;
//        System.out.println("Area of Triangle is: "+area);


        // AREA OF EQUILATERAL TRIANGLE

        System.out.print("Enter the side of triangle : ");
        int a =i.nextInt();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("Area "+area);
        i.close();


    }
}
