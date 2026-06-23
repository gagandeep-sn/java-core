import java.util.Scanner;

public class FactorOfNum {
    public static void main(String[] args) {
        System.out.print("Enter Num : ");
        Scanner i = new Scanner(System.in);

        int n = i.nextInt();
        int c=1;
        int z=1;

        while (c<=n) {

            if (n%c==0) {
                System.out.println("Factor "+z+" is "+c);
                z++;
            }
            c++;

        }

    }
}
