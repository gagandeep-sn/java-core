import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num : ");
        int a = sc.nextInt();
        System.out.print("Enter second num : ");
        int b = sc.nextInt();
        System.out.print("Enter third num : ");
        int c = sc.nextInt();
//        int max=0;
//        max=a;
//
//        if (b>max) {
//            max=b;
//        }
//        if (c>max) {
//            max=c;
//        }
//        System.out.println(max +" is Greater");


        // Second Approch
        if (a>=b && a>=c) {
            System.out.println("a is Greater");
        } else if (b>=a && b>=c) {
            System.out.println("b is Greater");
        }
        else {
            System.out.println("c is Greater");
        }


    }

}
