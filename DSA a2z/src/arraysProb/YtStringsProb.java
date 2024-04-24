package arraysProb;

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

    public static void main(String[] args) {
        String str = "Hello You are great.";
        printFirstChar(str);
        printFirstChar1(str);
    }
}
