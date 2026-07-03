import java.util.Scanner;

public class CheckGrade {
    public static void main(String[] args) {
        System.out.print("Enter the Marks (out of 100)  : ");
        Scanner i = new Scanner(System.in);
        int marks = i.nextInt();
        System.out.print("Your Grade is ");
        grade(marks);


    }
    static void grade (int marks) {
        if (marks>90) {
            System.out.println("AA");

        } else if (marks>80) {
            System.out.println("AB");


        } else if (marks>70) {
            System.out.println("BB");

        } else if (marks>60) {
            System.out.println("BC");

        } else if (marks>50) {
            System.out.println("CD");

        } else if (marks>40) {
            System.out.println("DD");

        } else {
            System.out.println("Fail");
        }
    }
}
