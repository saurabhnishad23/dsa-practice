package pattern;

public class Pattern {
    public static void main(String[] args) {

        numStarPattern(5);
        starPyramid(5);
        printPascal(5);
        diamondPyramid(5);
        String str = "a2b4c5";
        print(str);
    }

    public static void starPyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numStarPattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void printPascal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }
            int x = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }

    static void print(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                System.out.print(str.charAt(i));
            } else {
                int x = Character.getNumericValue(str.charAt(i));
                for (int j = 1; j < x; j++) {
                    System.out.print(str.charAt(i - 1));
                }
            }
        }

        // for (int i = 0; i < str.length(); i++) {
        // if (Character.isAlphabetic(str.charAt(i))) {
        // System.out.print(str.charAt(i));
        // } else {
        // int x = Character.getNumericValue(str.charAt(i));
        // for (int j = 1; j < x; j++) {
        // System.out.print(str.charAt(i - 1));
        // }
        // }
        // }
    }

    static void diamondPyramid(int n) {
        // upper diamond patter
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower diamond part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for (int i = 0; i < str.length(); i++) {
        // if (Character.isAlphabetic(str.charAt(i))) {
        // System.out.print(str.charAt(i));
        // } else {
        // int x = Character.getNumericValue(str.charAt(i));
        // for (int j = 1; j < x; j++) {
        // System.out.print(str.charAt(i - 1));
        // }
        // }
        // }
    }
}
