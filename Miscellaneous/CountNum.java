import javax.management.StringValueExp;
import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num =sc.nextInt();
        System.out.print("Enter which number to count :");
        long x= sc.nextLong();
        int count=0;

       do{
            if (num%10==x){
                count++;
            }
            num=num/10;

        }while (num!=0);
        System.out.println(count);
    }
}
