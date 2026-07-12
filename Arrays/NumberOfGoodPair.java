public class NumberOfGoodPair {
    public static void main(String[] args) {
        int[] num ={1,2,3,1,1,3};
        int count=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length ; j++) {
                if (num[i]==num[j]) {
                    count++;
                }

            }

        }
        System.out.println("The Number of good pair is : "+count);
    }
}
