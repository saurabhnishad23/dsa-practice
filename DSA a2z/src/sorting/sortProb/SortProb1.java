package sorting.sortProb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SortProb1 {
    static void addTwoArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = arr1[i] + arr2[i];
        }
        for (int elem : ans) {
            System.out.println(elem + " ");
        }
    }

    static int[] movesZeroes(int[] arr) {
        int n = arr.length;

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        int nz = temp.size();

        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    // Union of Sorted array

    static ArrayList<Integer> unionOfArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        HashSet<Integer> temp = new HashSet<>();

        ArrayList<Integer> union = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            temp.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            temp.add(arr2[i]);
        }

        for (int elem : temp) {
            union.add(elem);
        }
        return union;
    }

    static int missingNum(int[] input) {
        int n = input.length;
        int sumOfNaturalNum = (n * (n + 1)) / 2;
        int sumOfInput = 0;
        for (int i = 0; i < input.length - 1; i++) {
            sumOfInput += input[i];
        }
        int reqNum = sumOfNaturalNum - sumOfInput;
        return reqNum;
    }

    static void consecutiveOnes(int[] arr) {
        int n = arr.length;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }

    static int singleNum(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }

    static int singleTime(int[] arr) {
        int xorr = 0;
        for (int i = 0; i < arr.length; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    static void getLongestSubArray(int[] arr, int s) {
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == s) {
                    len = Math.max(len, j - i + 1);

                }
            }

        }
        System.out.println(len + " Longest Subarray");
    }

    static String pairSum(int[] a, int s) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] + a[j] == s) {
                    return "Yes";
                }
            }
        }
        return "no";
    }

    static void maxSubArray(int[] a) {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {

                    sum += a[k];
                }
                max = Math.max(max, sum);

            }
        }
        System.out.println(max);
    }

    // kadane's algorithm*
    static int maxSubArray1(int[] a) {
        int n = a.length;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];

            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 42, 3, 6 };
        int[] input = { 1, 2, 3, 4 };
        // int[] input1 = { 1, 2, 4, 5, 6, 7, 8, 9 };
        int[] doub = { 4, 1, 2, 1, 2 };
        addTwoArrays(arr, input);
        int[] inp = { 2, 0, 0, 4, 5, 0, 0, 4, 7 };
        movesZeroes(inp);
        for (int elem : inp)
            System.out.print(elem + " ");
        System.out.println();
        // System.out.println(missingNum(input1));
        int[] con = { 1, 1, 0, 1, 1, 1 };
        consecutiveOnes(con);
        System.out.println(singleNum(doub));

        System.out.println(singleTime(doub));
        System.out.println("jsldfj;j");
        int[] a = { -1, 1, 1, 4, 5 };
        getLongestSubArray(a, 5);

        int[] a1 = { 2, 6, 5, 8, 11 };
        int target = 14;
        System.out.println(pairSum(a1, target));

        int[] ar = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray1(ar));

    }
}
