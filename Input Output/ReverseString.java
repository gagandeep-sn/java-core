import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter String : ");
        Scanner s = new Scanner(System.in);
           String str =s.next();
           int i = str.length()-1;
           String f = "";

        for (int j = i; j >=0 ; j--) {

            char c=str.charAt(j);
            f=f+c;

        }

        System.out.println(f);


        }
    }

