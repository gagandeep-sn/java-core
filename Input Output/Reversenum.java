
import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int n = sc.nextInt();
        int count =0;

        do{
            count=n%10;
            System.out.print(count);
            n=n/10;
        }while (n!=0);
        sc.close();
    }

}
