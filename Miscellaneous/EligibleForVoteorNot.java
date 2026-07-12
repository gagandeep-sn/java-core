import java.util.Scanner;

public class EligibleForVoteorNot {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = i.nextInt();
       boolean result =  eligibleOrNot(age);
        if (result) {
            System.out.println("Eligible for Voting.");

        } else {
            System.out.println(" Not Eligible for Voting.");
        }


    }
    static boolean eligibleOrNot (int a) {
       boolean b = a>=18;

       return b;

    }
}
