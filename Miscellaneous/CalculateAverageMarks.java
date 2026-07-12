import java.util.Scanner;

public class CalculateAverageMarks {
    public static void main(String[] args) {
            Scanner i = new Scanner(System.in);
            System.out.println("Enter the number of Subject : ");
            int subject = i.nextInt();
            double total=0;

            for (int k=1; k<=subject; k++) {

                System.out.print("Enter Subject "+k+" " + " Marks : ");
                double marks = i.nextDouble();

                total = total+ marks;
            }
            double avg = total/subject;
        System.out.printf("The average is : %.2f",avg);

    }
}
