package arraysProb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysProb {
    static int maxProfit(int[] arr) {
        int n = arr.length;

        int minPrice = Integer.MAX_VALUE;
        int maxPro = 0;

        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }

    static int[] rearrangeBySign(int[] arr) { // pending
        int n = arr.length;
        int[] ans = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[posIndex] = arr[i];
                posIndex += 2;
            } else {
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
        }
        return ans;
    }

    static int[] rearrangeBySign1(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
        return arr;
    }

    static void pascalTriangle(int n) {
        long ans = 1;
        System.out.println(ans + " ");
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i != 0 && arr[i] == arr[n - 1])
                continue;
            int j = i + 1;
            int k = n - i - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int re[] = { 1, 2, -4, -5 };
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
        rearrangeBySign1(re);
        for (int elem : re) {
            System.out.print(elem + " ");
        }
        System.out.println();
        int n = 5;
        pascalTriangle(n);

        int[] arr1 = { -1, 0, 1, 2, -1, -4 };
        // int n1 = arr1.length;
        List<List<Integer>> ans = threeSum(arr1);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

}
