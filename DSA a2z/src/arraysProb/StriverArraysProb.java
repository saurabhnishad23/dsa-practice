package arraysProb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StriverArraysProb {

    static int largestElem(int[] arr) {
        int n = arr.length;

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    static int secondLargest(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        int secLarge = Integer.MIN_VALUE;

        if (n < 2)
            return -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secLarge = largest;
                largest = arr[i];
            } else if (secLarge < arr[i] && arr[i] != largest) {
                secLarge = arr[i];
            }
        }
        return secLarge;
    }

    static int removeDupli(int[] arr) {
        int n = arr.length;
        Set<Integer> temp = new HashSet<>();

        for (int i = 0; i < n; i++) {
            temp.add(arr[i]);

        }
        int k = temp.size();
        int j = 0;
        for (int val : temp) {
            arr[j++] = val;
        }
        return k;

    }

    static int remoDupli(int[] arr) {
        int i = 0;
        int n = arr.length;
        for (int j = i; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    static void movesOnePlace(int[] arr) {
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void Reverse(int[] arr, int start, int end) {
        if (arr.length == 0)
            return;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static int conseOnes(int[] arr) {
        int n = arr.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else
                count = 0;

            max = Math.max(max, count);
        }
        return max;
    }

    static void rotate(int[] arr, int d) {
        int n = arr.length;
        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Function to Rotate k elements to right
    public static void rotateeletoright(int[] arr, int n, int k) {
        // Reverse first n-k elements
        Reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        Reverse(arr, n - k, n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
    }

    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProf = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProf) {
                maxProf = prices[i] - minPrice;
            }
        }
        return maxProf;
    }

    static int maxConseInt(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmaller) {
                count += 1;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    static int longestConseSeq(int[] arr) {
        int n = arr.length;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int longest = 1;

        for (int val : set) {
            if (!set.contains(val - 1)) {
                int count = 1;
                int x = val;

                while (set.contains(x + 1)) {
                    x = x + 1;
                    count += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    static int maxConsecutive(int[] arr) {
        int n = arr.length;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int count = 0;
        int longest = 1;

        for (int value : set) {
            if (!set.contains(value - 1)) {
                count = 1;
                int x = value;

                while (set.contains(x + 1)) {
                    count++;
                    x = x + 1;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 4, 7, 7, 5 };
        // int arr1[] = { 1, 1, 2, 2, 2, 3, 4 };
        // int k = removeDupli(arr1);
        // int k1 = remoDupli(arr);
        // for (int val : k) {

        // System.out.print(val + " ");
        // // }
        // System.out.println("removed dupli");
        // for (int i = 0; i < k; i++) {
        // System.out.print(arr1[i] + " ");
        // }
        // System.out.println();

        // // System.out.println(secondLargest(arr));
        // int[] rot = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // rotate(arr1, 3);
        // System.out.println(" Rotated arr");
        // for (int i = 0; i < rot.length; i++) {
        // System.out.print(rot[i] + " ");
        // }
        // }

        int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 7;
        int k = 3;

        // rotateeletoright(array1, n, k);
        rotate(array1, k);
        System.out.print("After Rotating the k elements to right ");
        for (int i = 0; i < n; i++)
            System.out.print(array1[i] + " ");
        System.out.println();
        int nums[] = { 1, 1, 0, 1, 1, 1, 0 };
        int ans = conseOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);

        int[] a = { 100, 200, 99, 101, 4, 1, 2, 3, };
        int ans1 = maxConsecutive(a);
        System.out.println("The longest consecutive sequence is " + ans1);
    }
}
