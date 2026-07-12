public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat= {
                {1,2,3},
                {4,9,6},
                {7,8,9}

        };
        int primarySum=0;
        int secondorySum=0;

        for (int row = 0; row < mat.length; row++) {
            primarySum += mat[row][row];
        }

        int row=0;
            for (int col = mat.length-1; col >=0; col--) {
                secondorySum += mat[row][col];
                row++;


            }
        System.out.println(primarySum +" and "+secondorySum);
            int sum=0;

            if (mat.length%2!=0) {
                int extra=mat[mat.length/2][mat.length/2];
                sum=primarySum+secondorySum-extra;
            } else {
                sum= primarySum+secondorySum;
            }
        System.out.println(sum);

    }
}
