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

    public static void main(String[] args) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(checkAnagram(Str1, Str2));
        System.out.println(checkAnagrams(Str1, Str2));

        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }
}
