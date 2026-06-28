import java.util.Scanner;

public class FindNcrAndNpr {
    public static void main(String[] args) {
        System.out.print("Enter Number of items : ");
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        System.out.print("number of items to choose or arrange : ");
        int r = i.nextInt();
        int d = n - r;
        n = factorial(n);
        r = factorial(r);
        d = factorial(d);

            int ncr = n/(r*d);
            int npr= n/d;

        System.out.println("NCR is : "+ncr);
        System.out.println("NpR is : "+npr);


    }

          static int factorial(int a) {
              int fac=1;
              while (a!=0) {
                  fac=fac*a;
                  a--;
              }
              return fac;
          }



    }
