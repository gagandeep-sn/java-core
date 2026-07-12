import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.print("Enter Num : ");
        Scanner i = new Scanner(System.in);
          int num = i.nextInt();

          int count=0;
          int sum =0;
        int temp = num;
        int temp2 =num;

          while (temp!=0) {
                temp = temp/10;
                count++;
            }

            while(temp2!=0){
                int c=temp2%10;
                int next = (int) Math.pow(c,count);
                    temp2 = temp2/10;
                    sum= sum+next;


            }

            if(sum==num) {
                System.out.println(num+" is Armstrong number.");
            } else {
                System.out.println("Not Armstrong Num.");
            }

            }

    }
