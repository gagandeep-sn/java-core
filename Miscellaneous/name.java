import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        System.out.println("Enter the Char : ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int a = (int) c;
        int next = a+1;
        char n = (char) next;
        System.out.println("The next char is  : "+n);

        sc.close();



    }
}
