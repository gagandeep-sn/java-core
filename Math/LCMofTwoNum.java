import java.util.Scanner;

public class LCMofTwoNum {
    public static void main(String[] args) {
        System.out.print("Enter num1 : ");
        Scanner i = new Scanner(System.in);
        int n1 = i.nextInt();
        System.out.print("Enter num2 : ");
        int n2 = i.nextInt();
        int max = Math.max(n1,n2);
        int d= max;
        int lcm=0;

        while (true) {

            if(d%n1==0 && d%n2==0) {
                lcm=d;
                break;
            }
            d++;
        }
        System.out.println("LCM is : "+lcm);
    }
}
