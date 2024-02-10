package recursion;

public class Recursion {

    public static void sumOfNum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

    static void revArr(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--)
            ans[i] = arr[n - i - 1];

        for (int i = 0; i < n; i++)
            System.out.print(ans[i] + " ");
    }

    static void fiboSeries(int n) {
        int first = 0;
        int sec = 1;
        System.out.print(first + " " + sec);
        for (int i = 2; i < n; i++) {
            int next = first + sec;
            System.out.print(" " + next);

            first = sec;
            sec = next;
        }
    }

    public static void main(String[] args) {
        sumOfNum(9);

        System.out.println(factorial(5));
        int[] arr = { 1, 2, 3, 4, 5 };

        revArr(arr);
        System.out.println();
        fiboSeries(8);
    }
}
