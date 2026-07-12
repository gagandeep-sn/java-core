import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.print("Enter num : ");
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();

        Check(n);
    }
    static void Check (int q) {
        if (q%2==0) {
            System.out.println(q+" is even.");
        } else {
            System.out.println(q+" is odd.");
        }
    }
}
