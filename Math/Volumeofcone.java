import java.util.Scanner;

public class Volumeofcone {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Enter the Radius : ");
           int r= i.nextInt();
        System.out.println("Enter the Height: ");
           int h= i.nextInt();

         double volume= 0.333*3.14*r*r*h;

        System.out.println("Volume of of cone is : "+volume);



    }
}
