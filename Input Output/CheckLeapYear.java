import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the year : ");
        Scanner i = new Scanner(System.in);
          int year = i.nextInt();

          if (year%4==0){
              if (  year%400==0|| year%100!=0) {
                  System.out.println(year + " is Leap year.");
              }else {
                  System.out.println(year+" is not a Leap year.");
              }
          } else {
              System.out.println(year+" is not a Leap year.");

          }
    }
}
