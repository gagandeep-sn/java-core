public class Floor {
    public static void main(String[] args) {
        int[] arr = {-6, -5, 0, 3, 6, 28, 43, 69};
        int target = 5;
        int ans = floor(arr, target);
        System.out.println("The ceiling element is : " + arr[ans]);

    }
// This function is for binary serarch
    static int floor(int[] arr, int target) {
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
        // This return the larget number which is smaller than target.
        return end;
    }
}
