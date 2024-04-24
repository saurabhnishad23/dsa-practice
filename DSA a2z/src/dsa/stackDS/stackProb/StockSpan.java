package dsa.stackDS.stackProb;

import java.util.Stack;

public class StockSpan {
    static int[] stockSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while ((!stack.isEmpty()) && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int N = 7;
        int[] price = { 100, 80, 60, 70, 60, 75, 85 };
        int[] output = stockSpan(price);

        // Print the output array
        for (int i = 0; i < N; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
