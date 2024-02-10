package sorting;

public class Sorting {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // 0 to lenght - 2
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void selectionSort1(int[] input) {
        int n = input.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = input[minIndex];
                input[minIndex] = input[i];
                input[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }
    }

    static void selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        for (int elem : arr) {
            System.out.print(elem + " ");
        }

    }

    static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void insertionSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (int elem : arr)
            System.out.print(elem + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 23, 76, 23, 12, 1, 4, 9 };
        bubbleSort(arr);
        System.out.println();
        selectionSort(arr);
        System.out.println();
        selectionSort1(arr);
        System.out.println();
        insertionSort(arr);
        System.out.println();
        selectionSort2(arr);
        System.out.println();
        insertionSort1(arr);

    }
}
