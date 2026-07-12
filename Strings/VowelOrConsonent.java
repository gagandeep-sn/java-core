import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        System.out.print("Enter Alphabet : ");
        Scanner i = new Scanner(System.in);
        char d = i.next().charAt(0);
        char c = Character.toLowerCase(d);


        if (Character.isLetter(c)==false) {
            System.out.println(c+" is not Alphabet.");
        } else {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                System.out.println(d+" is Vowel.");
            } else {
                System.out.println(d+" is Consonant.");
            }
        }

    }
}
