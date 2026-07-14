import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {

        int[][] mat = {
                {1, 2},
                {3, 4}
        };

        int r = 1;
        int c = 4;

        int oldRow = mat.length;
        int oldCol = mat[0].length;

        // Check if reshape is possible
        if (oldRow * oldCol != r * c) {
            System.out.println(Arrays.deepToString(mat));
            return;
        }

        int[][] ans = new int[r][c];

        int newRow = 0;
        int newCol = 0;

        for (int i = 0; i < oldRow; i++) {
            for (int j = 0; j < oldCol; j++) {

                ans[newRow][newCol] = mat[i][j];

                newCol++;

                if (newCol == c) {
                    newCol = 0;
                    newRow++;
                }
            }
        }

        System.out.println(Arrays.deepToString(ans));
    }
}