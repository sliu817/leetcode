package index3;

/**
 * Created by yduan on 1/28/15.
 */
public class StringToInteger {
    public int atoi(String str) {
        if (str == null || str.length() == 0) return 0;
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ')  i++;

        boolean positive = true;
        if (i < str.length() && str.charAt(i) == '-') {
            positive = false;
            i++;
        } else if (i < str.length() && str.charAt(i) == '+') {
            i++;
        }

        int result = 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            if (Integer.MAX_VALUE / 10 >= result)
                result = result * 10 ;
            else
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            if (Integer.MIN_VALUE - result >= digit)
                result = result + digit;
            else
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            i++;
        }
        return positive ? result : -result;
    }

    private int stol(String str) {
        if (str == null || str.length() == 0) return 0;
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ')  i++;

        boolean positive = true;
        if (i < str.length() && str.charAt(i) == '-') {
            positive = false;
            i++;
        } else if (i < str.length() && str.charAt(i) == '+') {
            i++;
        }

        int result = 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            if (Integer.MAX_VALUE / 10 < result)
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else if (positive && Integer.MAX_VALUE / 10 == result && digit > Integer.MAX_VALUE % 10)
                return Integer.MAX_VALUE;
            else if (!positive && Integer.MAX_VALUE / 10 == result && digit > Integer.MAX_VALUE % 10 + 1)
                return Integer.MIN_VALUE;
            else
                result = result * 10 + digit;
            i++;
        }
        return positive ? result : -result;
    }
}
