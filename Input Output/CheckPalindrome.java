import java.util.Scanner;

public class CheckPalindrome {
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


        if(str.equals(f)) {
            System.out.println(str+" is Palindrom.");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
