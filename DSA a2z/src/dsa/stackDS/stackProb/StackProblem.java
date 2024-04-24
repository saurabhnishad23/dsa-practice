package dsa.stackDS.stackProb;

import java.util.Stack;

public class StackProblem {
    public static int minAddToMakeValid(String s) {
        int c = 0;
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
                c++;
            } else if (s.charAt(i) == ')') {
                if (st.size() == 0) {
                    c++;
                } else {
                    st.pop();
                    c--;
                }
            }
        }
        return c;
    }

    static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (topChar != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean balancedParenthesis(String str) {
        int n = str.length();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {

            char currChar = str.charAt(i);
            if (currChar == '(') {
                st.push(currChar);
            } else if (currChar == ')') {
                if (st.isEmpty()) {
                    return false;
                }
                char topChar = st.pop();

                if (topChar != '(') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    static Stack<Integer> reverseStack(Stack<Integer> st) {
        Stack<Integer> stack = new Stack<>();

        while (!st.isEmpty()) {
            stack.push(st.pop());
        }
        return stack;
    }

    // static void balancedBrackets(String str) {
    // int n = str.length();
    // if (n % 2 != 0) {

    // System.out.println("\nUnbalanced");
    // }
    // Stack<Character> st = new Stack<>();

    // for (int i = 0; i < n; i++) {
    // char currChar = str.charAt(i);
    // if (currChar == '(' || currChar == '{' || currChar == '[') {
    // st.push(currChar);
    // } else if (currChar == ')') {
    // if (st.isEmpty() || st.pop() != '(') {

    // System.out.println("\nUnbalanced1 Parantesis");
    // return;
    // }
    // } else if (currChar == '}') {
    // if (st.isEmpty() || st.pop() != '{') {

    // System.out.println("\nUnbalanced2 Parantesis");
    // return;
    // }
    // } else if (currChar == ']') {
    // if (st.isEmpty() || st.pop() != '[') {

    // System.out.println("\nUnbalanced3 Parantesis");
    // return;
    // }
    // }
    // }
    // if (st.isEmpty()) {
    // System.out.println("\nBalanced1 Parenthesis");
    // } else {
    // System.out.println("\nUnbalanced");
    // }
    // }

    static boolean isValid(String str) {
        int n = str.length();
        if (n % 2 != 0) {
            return false;
        }
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char curChar = str.charAt(i);
            if (curChar == '(' || curChar == '{' || curChar == '[') {
                st.push(curChar);

            } else if (curChar == ')') {
                if (st.isEmpty()) {
                    return false;
                } else if (st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }

            } else if (curChar == '}') {
                if (st.isEmpty()) {
                    return false;
                } else if (st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (curChar == ']') {
                if (st.isEmpty()) {
                    return false;
                } else if (st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (!st.isEmpty()) {
            return false;
        }
        return true;
    }

    // Check Redundant Brackets

    public static boolean isValid1(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (st.size() == 0) {
                    return false;
                } else if (st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (st.size() == 0) {
                    return false;
                } else if (st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (st.size() == 0) {
                    return false;
                } else if (st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.size() != 0) {
            return false;
        }
        return true;
    }

    // Stock Span Problem
    static int[] stockSpan(int[] price) {
        int n = price.length;

        int[] span = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            span[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return span;
    }

    static int[] stockSpan1(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        String str = "())))";

        // System.out.println(isBalanced(str));
        System.out.println(minAddToMakeValid(str));
        String balancedString = "(())()";
        String unbalancedString = "())(";
        System.out.println("Is balanced: " + balancedParenthesis(balancedString));
        System.out.println("Is balanced: " + balancedParenthesis(unbalancedString));
        System.out.println("isValid ");
        System.out.println(isValid(balancedString));
        System.out.println(isValid(unbalancedString));

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        for (int val : st) {
            System.out.print(val + " ");
        }
        System.out.println();
        Stack<Integer> stack = reverseStack(st);
        for (int val : stack) {
            System.out.print(val + " ");
        }

        String str1 = "[]{()}((}";
        String str2 = "{}[()]()";
        // balancedBrackets(str1);
        // balancedBrackets(str2);
        System.out.println("str1, str2");
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));

        int[] price = { 12, 25, 16, 43, 28, 59, 24, 11 };
        int[] span = stockSpan(price);
        for (int val : span) {
            System.out.print(val + " ");
        }
        System.out.println();
        int[] price1 = { 100, 80, 60, 70, 60, 75, 85 };
        int[] output = stockSpan1(price1);

        // Print the output array
        for (int i = 0; i < price1.length; i++) {
            System.out.print(output[i] + " ");
        }

    }
}