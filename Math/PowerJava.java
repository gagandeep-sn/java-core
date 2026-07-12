import java.util.Scanner;

public class PowerJava {
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner i =new Scanner(System.in);
        int a = i.nextInt();
        System.out.print("Enter the Power : ");
        int b = i.nextInt();
        int power=b;

        int n =1;
        while (b!=0) {
            int exp= n * a;
            n=exp;
            b--;

        }
        System.out.println("The num "+a+"^"+power+" is : "+n);
    }
}
