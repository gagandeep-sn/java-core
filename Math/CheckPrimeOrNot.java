import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the num : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (checkPrime(num)) {
            System.out.println(num+ " is a prime num.");

        } else {
            System.out.println("Not Prime.");
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
