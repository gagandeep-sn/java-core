import java.util.Scanner;

public class PalindromOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the Num : ");
        Scanner i = new Scanner(System.in);
        int num = i.nextInt();
        palindrom(num);

    }

    static void palindrom(int n) {
        int temp=n;
        int newnum=0;
        while(temp!=0) {
            int p=temp%10;
            newnum=(newnum*10)+p;
            temp=temp/10;

        }
        if (n==newnum){
            System.out.println("Num is Palindrom.");

        } else{
            System.out.println("not Palindrom.");
        }
    }
}
