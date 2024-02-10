package basicMaths;

public class BasicMaths {

    public static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static int countDigits1(int n) {
        int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    }

    public static int reverseNum(int n) {
        int x = n;
        int rem;
        int revNum = 0;

        while (x != 0) {
            rem = x % 10;
            revNum = revNum * 10 + rem;
            x /= 10;
        }

        return revNum;
    }

    public static boolean checkPalindrome(int n) {
        int x = n;
        int sum = 0;
        int rem;

        while (x != 0) {
            rem = x % 10;
            sum = sum * 10 + rem;
            x /= 10;
        }

        if (n == sum) {
            return true;
        }
        return false;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static boolean checkArmstrong(int n) {

        int digits = 0;
        int x = n;
        int rem = 0;
        int sum = 0;

        digits = (int) Math.floor(Math.log10(n)) + 1;

        while (x != 0) {
            rem = x % 10;
            sum = sum + (int) Math.pow(rem, digits);
            x /= 10;
        }
        if (n == sum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(98454));
        System.out.println(countDigits1(784));
        System.out.println(reverseNum(4321));
        System.out.println(checkPalindrome(4321234));
        System.out.println(checkPalindrome(12213234));
        System.out.println(gcd(15, 18));
        System.out.println(checkArmstrong(265));
        System.out.println(checkArmstrong(153));

    }

}
