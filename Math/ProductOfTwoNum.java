import java.util.Scanner;

public class ProductOfTwoNum {
    public static void main(String[] args) {
        System.out.print("Enter Num1 : ");
        Scanner i = new Scanner(System.in);
        int num1=i.nextInt();
        System.out.print("Enter Num2 :");
        int num2 =i.nextInt();
        System.out.println("The Product is : "+product(num1,num2));

    }
    static int product(int num1,int num2) {
        int product = num1*num2;
        return product;
    }
}
