import java.util.Scanner;

public class CheckPythagoreanTriplet {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Enter a: ");
          int a= i.nextInt();
        System.out.print("Enter b: ");
        int b= i.nextInt();
        System.out.print("Enter c: ");
        int c= i.nextInt();
        triplet(a,b,c);


    }
    static void triplet(int a,int b,int c) {
        int d= (int)Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
        if(c==d) {
            System.out.println("It is Pythagorean Triplet.");
        } else {
            System.out.println("not pythagorean triplet");
        }

    }
}
