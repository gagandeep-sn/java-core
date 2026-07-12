import java.util.Scanner;

public class Fibbonachi {
    public static void main(String[] args) {
        System.out.print("Enter the num : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x=0;
        int y=1;
        int next=0;

//        while (n>0) {
//            System.out.println(x);
//
//            next=x+y;
//            int temp=y;
//            x=temp;
//            y=next;
//            n --;
//
//        }

        int i;
        for (i=0; i<n; i++) {
            System.out.println(x);
            next = x + y;
            int temp = y;
            x = temp;
            y = next;


        }
    }
}
