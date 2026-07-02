import java.util.Scanner;

public class SumOFTwoNum {
    public static void main(String[] args) {
        System.out.print("Enter Num1 : ");
        Scanner i = new Scanner(System.in);
        int num1=i.nextInt();
        System.out.print("Enter Num2 :");
        int num2 =i.nextInt();
        System.out.println("The Sum is : "+sum(num1,num2));

    }
    static int sum(int num1,int num2) {
        int add = num1+num2;
        return add;
    }
}
