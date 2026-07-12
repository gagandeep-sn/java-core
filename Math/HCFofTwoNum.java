import java.util.Scanner;

public class HCFofTwoNum {
    public static void main(String[] args) {
        System.out.println("Enter num1 : ");
        Scanner i = new Scanner(System.in);
        int n1 = i.nextInt();
        System.out.println("Enter num2 : ");
        int n2 = i.nextInt();
        int min = Math.min(n1,n2);
        int d=1;
        int hcf=0;

           while (min>=d) {

               if(n1%d==0 && n2%d==0) {
                   hcf=d;

               }
               d++;

           }
        System.out.println("HCF is : "+hcf);


    }
}
