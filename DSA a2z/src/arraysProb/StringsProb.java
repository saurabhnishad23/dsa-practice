package arraysProb;

import java.util.Arrays;

public class StringsProb {

    static String sortString(String str) {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);

    }

    static boolean checkAnagram(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        if (n != m)
            return false;

        str1 = sortString(str1);
        str2 = sortString(str2);

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String SortString(String str) {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static boolean checkAnagrams(String str1, String str2) {
        // Case 1: when both of the strings have different lengths
        if (str1.length() != str2.length())
            return false;

        str1 = SortString(str1);
        str2 = SortString(str2);

        // Case 2: check if every character of str1 and str2 matches with each other
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }

    public static String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }

    static String revString(String str) {
        int n = str.length();
        String newStr = "";
        // for (int i = n - 1; i >= 0; i--) {
        // newStr = newStr + str.charAt(i);
        // }
        for (int i = 0; i < n; i++) {
            newStr = newStr + str.charAt(n - i - 1);
        }
        return newStr;
    }
    // masked prob or hide sensitive info

    static String hideInfo(String s) {
        int n = s.length();
        StringBuilder hideNum = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i < 4 || i >= n - 4) {
                hideNum.append(s.charAt(i));
            } else {
                hideNum.append("*");
            }
        }
        return hideNum.toString();
    }

    static String hideData(String s) {
        int n = s.length();
        StringBuilder hideNum = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i < 4 || i >= n - 4) {
                hideNum.append(s.charAt(i));
            } else {
                hideNum.append("*");
            }
        }
        return hideNum.toString();
    }

    static int binaryToDecimal(int n) {

        int binaryNum = 0;
        int count = 0;

        while (n != 0) {
            int rem = n % 2;
            Double c = Math.pow(10, count);
            binaryNum += c * rem;
            n /= 2;
            count++;
        }
        return binaryNum;
    }

    static int binaryToDec(int n) {
        int binaryNumber = 0;
        int count = 0;

        while (n != 0) {
            int rem = n % 2;
            Double c = Math.pow(10, count);
            binaryNumber += rem * c;
            n /= 2;
            count++;
        }
        return binaryNumber;
    }

    static boolean isPallindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(checkAnagram(Str1, Str2));
        System.out.println(checkAnagrams(Str1, Str2));

        String str = "the sky is blue";
        System.out.println(reverseWords(str));

        String input = "123456781234";
        String output = hideData(input);
        System.out.println("Output: " + output);

        System.out.println(binaryToDec(11));

        System.out.println(isPallindrome("abbas"));

        System.out.println(reverseWords("abcd e "));

        System.out.println(revString("HelloWorld"));

    }
}
