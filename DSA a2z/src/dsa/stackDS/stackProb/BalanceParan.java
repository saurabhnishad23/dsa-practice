package dsa.stackDS.stackProb;

import java.util.Stack;

public class BalanceParan {

    static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                    // closing
                }

                if (s.peek() == '(' && ch == ')'
                        || s.peek() == '{' && ch == '}'
                        || s.peek() == '[' && ch == ']') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening condition
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                // closing
                if (s.peek() == '(' && ch == ')'
                        || s.peek() == '[' && ch == ']'
                        || s.peek() == '{' && ch == '}') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void masking(String str) {
        int n = str.length();
        char[] c = str.toCharArray();

        for (int i = 0; i < n; i++) {
            if (i < 4 || i > n - 4) {
                System.out.print(c[i]);
            } else {
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        String str = "({}){}[]()";
        System.out.println(isValid(str));
        System.out.println(isBalanced(str));

        String str1 = "12345345534";
        masking(str1);

    }
}
