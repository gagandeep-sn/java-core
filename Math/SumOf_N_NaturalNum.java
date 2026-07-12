import java.util.Scanner;

public class SumOf_N_NaturalNum {
    public static void main(String[] args) {
        System.out.print("Enter the Num :");
        Scanner i=new Scanner(System.in);
        int num = i.nextInt();

        System.out.println("The sum of "+num+" natural num is : "+sum(num));

    }
    static int sum(int num) {
        int sum=0;
        for (int i = 1; i <= num; i++) {
            sum=sum+i;

        }
        return sum;
    }
}
