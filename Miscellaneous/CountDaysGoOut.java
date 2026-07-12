public class CountDaysGoOut {
    public static void main(String[] args) {
        int august =31;
        int count=0;
        while(august!=0){
            if (august%2!=0) {
                count++;
            }
            august--;
        }
        System.out.println("Number of days you can go out is : "+count);
    }
}
