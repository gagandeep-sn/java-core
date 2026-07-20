// i have to reappear  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
A lucky number in a matrix is an element that is:
The smallest number in its row, and
The largest number in its column.
*/

public class LuckyNumber {

    public static List<Integer> luckyNumbers(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowMin = new int[rows];
        int[] colMax = new int[cols];

        Arrays.fill(rowMin, Integer.MAX_VALUE);
        Arrays.fill(colMax, Integer.MIN_VALUE);

        // Find minimum of each row and maximum of each column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        List<Integer> answer = new ArrayList<>();

        // Find lucky numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    answer.add(matrix[i][j]);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        
// In this Given matrix 15 is the biggest num in column and smallest number in the row.
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        List<Integer> result = luckyNumbers(matrix);

        System.out.println("Lucky Numbers: " + result);
    }
}
