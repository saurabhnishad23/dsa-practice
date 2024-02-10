package sorting.sortProb;

public class SortingProb {

    static void pushZeroesToEnd(int[] arr) {
        int nonZeroes = 0; // initialize the index of starting array for storing non zeroes element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) { // filtering the non zeroes element
                int temp = arr[i]; // storing the nz in temp value
                arr[i] = arr[nonZeroes]; // passing this value to nz starting index
                arr[nonZeroes] = temp;
                nonZeroes++; // increasing the nz index
            }
        }
    }

    static void swap(int[] arr) {

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[arr.length - i - 1] = arr[i];

        }
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = ans[i];
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    static void reverse(int[] arr, int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateRight(int[] arr, int n, int k) {
        // reverse
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);

    }

    static void reverse1(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    static void rotateRight1(int[] arr, int d) {
        int n = arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int[] tempArr = new int[n];
        for (int i = 0; i < n; i++) {
            tempArr[n - 1 - i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = tempArr[i];
        }
    }

    // find second largest in array
    static void secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secLarge && arr[i] != largest) {
                secLarge = arr[i];
            }
        }
        System.out.println("2nd largest num is " + secLarge);
    }

    static void second(int[] arr) {
        if (arr.length == 0) {
            System.out.println(Integer.MIN_VALUE);
        }
        int largest = arr[0];
        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLarge = largest;
                largest = arr[i];
            } else if (arr[i] > secLarge && arr[i] != largest) {
                secLarge = arr[i];
            }
        }
        System.out.println(secLarge);
    }

    static void secondLargest1(int[] arr) {
        int n = arr.length;
        if (n < 2)
            System.out.println(-1);
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        System.out.println(second_large);
    }

    static void sort012(int[] arr) {
        int nextzero = 0;
        int nexttwo = arr.length - 1;
        int i = 0;
        while (i <= nexttwo) {
            if (arr[i] == 0) {
                int temp = arr[nextzero];
                arr[nextzero] = arr[i];
                arr[i] = temp;
                i++;
                nextzero++;
            } else if (arr[i] == 2) {
                int temp = arr[nexttwo];
                arr[nexttwo] = arr[i];
                arr[i] = temp;

                nexttwo--;
            } else {
                i++;
            }
        }

    }

    static void sort1(int[] arr) {
        int zeroes = 0;
        int twos = arr.length - 1;
        int i = 0;
        while (i < twos) {
            if (arr[i] == 0) {
                int temp = arr[zeroes];
                arr[zeroes] = arr[i];
                arr[i] = temp;
                zeroes++;
                i++;
            } else if (arr[i] == 2) {
                int temp = arr[twos];
                arr[twos] = arr[i];
                arr[i] = temp;
                twos--;
            } else {
                i++;
            }
        }
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 6, 0, 0, 1, 9, 9, 4, 0 };
        int arr0[] = { 2, 6, 0, 0, 1, 9, 9, 4, 0 };
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
        int abc[] = { 1, 0, 1, 2, 1, 0, 2, 0, 1, 2 };
        pushZeroesToEnd(arr0);

        for (int elem : arr0) {
            System.out.print(elem + " ");
        }
        System.out.println("-------");
        swap(arr2);
        System.out.println();
        // reverseArray(arr1);
        // rotateRight(arr1, 6, 2);
        rotateRight1(arr1, 4);
        for (int elem : arr1) {
            System.out.print(elem + " ");
        }
        System.out.println();
        secondLargest(arr1);
        secondLargest(arr);
        second(arr1);
        second(arr);
        secondLargest1(arr1);
        secondLargest1(arr);
        System.out.println(Integer.MIN_VALUE);
        sort012(abc);
        // for (int elem : abc) {
        // System.out.print(elem + " ");
        // }
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");
        }
        System.out.println();
        sort1(abc);
    }
}
