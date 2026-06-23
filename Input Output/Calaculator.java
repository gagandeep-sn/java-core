import java.util.Scanner;

public class Calaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operator (+, -, *, /, %) or n to exit: ");
            char c = sc.next().charAt(0);

            if (c == 'n') {
                System.out.println("Calculator Closed.");
                break;
            }

            System.out.print("Enter Num1: ");
            int n1 = sc.nextInt();

            System.out.print("Enter Num2: ");
            int n2 = sc.nextInt();

            int ans = 0;

            if (c == '+') {
                ans = n1 + n2;
            } else if (c == '-') {
                ans = n1 - n2;
            } else if (c == '*') {
                ans = n1 * n2;
            } else if (c == '/') {
                if (n2 != 0) {
                    ans = n1 / n2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    continue;
                }
            } else if (c == '%') {
                if (n2 != 0) {
                    ans = n1 % n2;
                } else {
                    System.out.println("Cannot modulo by zero.");
                    continue;
                }
            } else {
                System.out.println("Invalid Operator.");
                continue;
            }

            System.out.println("Answer = " + ans);
        }

        sc.close();
    }
}