import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the number of semester : ");
            int semester = i.nextInt();
            double total=0;

          for (int k=1; k<=semester; k++) {

              System.out.print("Enter Semester "+k+" percentage % : ");
                   double semesterpercentage = i.nextDouble();

                   total = total+semesterpercentage;
          }
          double overallpercentage = total/semester;
          double cgpa = overallpercentage/9.5;

   //Here we taking %.2f to take only two value after the point like 2.9289394 only take 2.93     
        System.out.printf("Your CGPA is : %.2f",cgpa);
    }
}
