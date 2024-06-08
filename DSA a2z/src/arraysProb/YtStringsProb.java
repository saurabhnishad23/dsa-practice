package arraysProb;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class YtStringsProb {
    // Print First char of a sentence
    static void printFirstChar(String str) {

        char[] c = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                if (i == 0) {
                    System.out.println(c[i]);
                } else if (c[i - 1] == ' ') {
                    System.out.println(c[i]);
                }
            }
        }
    }

    static void printFirstChar1(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ' && (i == 0 || a[i - 1] == ' ')) {
                System.out.print(a[i]);
            }
        }
    }

    static String reveString(String str) {
        int n = str.length();
        int start = 0;
        int end = n - 1;
        char[] c = str.toCharArray();

        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }
        return String.copyValueOf(c);
    }

    // Reverse individual Word of a sentence
    static void reverseWords(String str) {
        int n = str.length();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                st.push(str.charAt(i));
            } else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }

    static void revWords(String str) {
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                st.push(str.charAt(i));
            } else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }

    // Reverse entire sentences word from end
    static String revWord(String str) {
        int n = str.length();
        String finalStr = "";
        String tempStr = "";

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                finalStr = " " + tempStr + finalStr;
                tempStr = "";
            } else {
                tempStr = tempStr + c;
            }
        }
        finalStr = tempStr + finalStr;
        return finalStr;

    }

    // find unique Characters

    static int findUniqueChar(String str) {
        int n = str.length();

        if (str == null || str.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(str.charAt(i));
        }

        return set.size();
    }

    public static void main(String[] args) {
        String str = "Hello You are great.";
        printFirstChar(str);
        printFirstChar1(str);
        // String abc = reveString(str);
        // System.out.println(abc);
        System.out.println();
        reverseWords(str);
        System.out.println();
        revWords(str);
        String revStr = revWord(str);
        System.out.println();
        System.out.println("revWord");
        System.out.println(revStr);
        String check = "abc";
        System.out.println(findUniqueChar(check));
    }
}
