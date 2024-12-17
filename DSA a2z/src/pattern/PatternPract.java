package pattern;

public class PatternPract {

    static void triangle(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void leftTriangle(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 2 * (n - i - 1); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void equiTriangle(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void diamondTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertTri(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void sandClock(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollowTriangle(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || i == n - 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void invertPyra(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void rowCount(int n) {

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void increaseCount(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + j - 1);
            }
            System.out.println();
        }
    }

    static void linearCount(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void floydsTriangle(int n) {
        int p = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                p++;
            }
            System.out.println();
        }
    }

    static void printAlphabet(int n) {
        char p = 'A';

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(p + ",");
                p = (char) (p + 1);
            }
            System.out.println();
        }
    }

    static void linearChar(int n) {
        for (int i = 1; i < n; i++) {
            char p = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                // p++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Check");
        triangle(6);
        leftTriangle(6);
        equiTriangle(6);
        diamondTriangle(5);
        invertTri(6);
        System.out.println("----------------");
        sandClock(6);
        hollowTriangle(6);
        invertPyra(5);
        rowCount(5);
        increaseCount(5);
        linearCount(6);
        floydsTriangle(5);
        printAlphabet(9);
        linearChar(6);
    }
}
