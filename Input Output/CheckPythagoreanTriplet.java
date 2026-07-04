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
        int small1=0;
        int small2=0;
        int max=a;
        if (max<b) {
            max=b;
           small1=a;
        } else {
            small1=b;
        }
        if (max<c) {
            max=c;
            small1=a;
            small2=b;

        } else {
            small2=c;

        }
        triplet(small1,small2,max);



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
