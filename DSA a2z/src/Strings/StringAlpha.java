package Strings;

public class StringAlpha {
    // shortest path

    static double displacement(String s) {
        int n = s.length();
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            char dir = s.charAt(i);
            if (div == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else {
                y--;
            }
        }
        double displacement = (double) (Math.sqrt((x * x + y * y)));
        return displacement;
    }

    // pallindrome

    static boolean isPallindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "NENENW";
        System.out.println(displacement(s));
        String pal = "malayalam";
        System.out.println(isPallindrome(pal));
    }
}
