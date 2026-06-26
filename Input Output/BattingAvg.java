import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        System.out.print("Enter Runs Score in the series : ");
        Scanner i = new Scanner(System.in);
        int runs = i.nextInt();
        System.out.print("Enter no of times player is out : ");
        int out = i.nextInt();

        if (out!=0) {
            double avg = runs/out;
            System.out.println("batting avg is : "+avg);
        } else {
            System.out.println("Batting avg is : "+runs);
        }
    }
}
