package index1;

/**
 * Created by yduan on 1/30/15.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        int divisor = 1;

        while (num / divisor >= 10) {
            divisor *= 10;
        }

        while (num != 0) {
            int leftMostDigit = num / divisor;
            int rightMostDigit = num % 10;

            if (leftMostDigit != rightMostDigit) {
                return false;
            }

            num = (num % divisor) / 10;
            divisor = divisor / 100;
        }

        return true;
    }


    public boolean isPalindromeRecursive(int num) {
        if (num < 0) {
            return false;
        }

        if (num < 10) {
            return true;
        }

        int divisor = 1;

        while (num / divisor >= 10) {
            divisor *= 10;
        }

        int leftMostDigit = num / divisor;
        int rightMostDigit = num % 10;

        if (leftMostDigit != rightMostDigit) {
            return false;
        }

        num = (num % divisor) / 10;
        return isPalindromeRecursive(num);
    }


}
