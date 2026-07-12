import java.util.Scanner;

public class CheckPrimeBetweenTwoNum {
    public static void main(String[] args) {
        System.out.print("Enter the num1 : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter the num2 : ");
        int num2= sc.nextInt();
        int max= Math.max(num1,num2);
        int min=Math.min(num1,num2)+1;
        System.out.println("The prime Num between "+num1+" and "+num2+" are :");

        while (min!=max) {
            if (checkPrime(min)) {
                System.out.println(min);

            }
            min++;

        }

    }
    static boolean checkPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
