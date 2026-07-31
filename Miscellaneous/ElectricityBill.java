import java.util.Scanner;
// It take biil rate 5 rupee till 200 unit then 201 to 300 it take rate 7 after 300 it take rate 10 rupee
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the Units: ");
        int u =i.nextInt();
        int bill=0;
         int rate;  
           if (u<=100){
               rate=5;
               bill=u*rate;
           } else if (u<=200) {
               int n=u-100;
               rate=7;
               bill=(100*5)+(n*rate);

           } else {
               int n=u-200;
               rate =10;
               bill =(100*7)+(100*5)+(n*rate);
           }
        System.out.println("Your elctricity bill is : "+bill);
    }
}
