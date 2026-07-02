import java.util.Scanner;

public class MaxAndMIN3Num {
    public static void main(String[] args) {
        System.out.print("Enter the Num1 : ");
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        System.out.print("Enter the Num2 : ");
        int b = i.nextInt();
        System.out.print("Enter the Num3 : ");
        int c = i.nextInt();

        max(a,b,c);
        min(a,b,c);


    }

    static void max(int i,int j,int k) {
        int max=i;
        if(j>max) {
            max=j;
        }

        if (k>max) {
            max=k;

        }
        System.out.println("The max num is : "+max);

    }

    static void min(int i,int j,int k) {
        int min =i;
        if(j<min) {
            min=j;
        }

        if (k<min) {
            min=k;

        }
        System.out.println("The min num is : "+min);

    }
}
