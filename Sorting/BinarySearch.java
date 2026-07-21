public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-6, -5, 0, 3, 6, 28, 43, 69};
        int target = 0;
        int ans = binarySearch(arr, target);
        System.out.println("The index of target element is : " + ans);

    }

    // Through this function we going to find the index of the target element
    // if target not in array we return -1
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

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
        // if target is not in the array it return  -1.
        return -1;

    }
}
