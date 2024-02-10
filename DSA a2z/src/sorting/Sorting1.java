package sorting;

public class Sorting1 {

    static int[] mergeArr(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else {
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            ans[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;
    }

    static int[] merge(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int k = 0;

        int ans[] = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else {
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            ans[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 7, 23, 47, 86 };
        int[] arr2 = { 1, 5, 8, 10, 13, 34, 56 };

        int[] ans = mergeArr(arr1, arr2);
        int[] ans1 = merge(arr1, arr2);

        for (int elem : ans) {
            System.out.print(elem + " ");
        }
        System.out.println();
        for (int elem : ans1) {
            System.out.print(elem + " ");
        }
    }
}
