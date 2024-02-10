package sorting;

public class BinarySearch {

    static int binarySearch(int[] arr, int elem) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (elem == arr[mid]) {
                return mid;
            } else if (arr[mid] > elem) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 8, 23, 56, 78 };
        int ans = binarySearch(arr, 23);
        System.out.println(ans);
    }
}
