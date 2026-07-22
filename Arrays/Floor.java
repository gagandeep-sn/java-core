public class Floor {
    public static void main(String[] args) {
        int[] arr = {-6, -5, 0, 3, 6, 28, 43, 69};
        int target = 5;
        int ans = ceiling(arr, target);
        System.out.println("The ceiling element is : " + arr[ans]);

    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find middle element.
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;

            } else if (target > arr[middle]) {
                start = middle + 1;

            } else {
                return middle;
            }
        }
        return end;
    }
}
