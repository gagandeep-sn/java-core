import java.util.Arrays;


public class FlippingAnImage {
    public static void main(String[] args) {

        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        for (int row = 0; row < image.length; row++) {

            int left = 0;
            int right = image[row].length - 1;

            while (left <= right) {

                int temp = image[row][left];
                image[row][left] = image[row][right];
                image[row][right] = temp;

                image[row][left] = 1 - image[row][left];
                image[row][right] = 1 - image[row][right];

                left++;
                right--;
            }
        }

        System.out.println(Arrays.deepToString(image));
    }
}
