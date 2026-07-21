public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {32,31,24,22,8,6,-1,-3};
        int target = 8;
        int ans = orderAgnosticbinarySearch(arr,target);
        System.out.println("The index of target element is : " + ans);

    }

    // Through this function we going to find the index of the target element
    // if target not in array we return -1
    static int orderAgnosticbinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        boolean isAsen = arr[start]<arr[end];


        while (start <= end) {
            // Find middle element.
            int middle = start + (end - start) / 2;

            if (arr[middle]==target) {
                return middle;
            }


            if (isAsen) {

                if (target < arr[middle]) {
                    end = middle - 1;

                } else {
                    start = middle + 1;

                }
            } else {

                if (target > arr[middle]) {
                    end = middle - 1;

                } else {
                    start = middle + 1;

                }
            }
        }
        // if target is not in the array it return  -1.
        return -1;

    }
}
