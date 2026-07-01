import java.util.Scanner;

public class CountOddEvenORNegNum {
    public static void main(String[] args) {
        System.out.print("Enter the num : ");
        Scanner i = new Scanner(System.in);
        int negsum=0;
        int evensum=0;
        int oddsum=0;


        while (true) {
            int num = i.nextInt();

            if (num==0) {
                break;
            }

            if (num<0){
                negsum +=num;

            } else if (num%2==0) {
                evensum +=num;

            } else {
                oddsum +=num;
            }
        }
        System.out.println("sum of negative num is :" +negsum);
        System.out.println("sum of even num is :" +evensum);
        System.out.println("sum of Odd num is :" +oddsum);
    }
}
