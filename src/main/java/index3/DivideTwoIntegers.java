package index3;

/**
 * Created by yduan on 2/4/15.
 */
public class DivideTwoIntegers {
    public int divide (int dividend, int divisor) {
        int divd = Math.abs(dividend);
        int divs = Math.abs(divisor);

        int k = 0;
        while (divs << k < divd) {
            k++;
        }
        if (divs << k > divd) k--;

        int res = 0;
        while ( k > 0) {
            if (divd - (divs << k) >= 0) {
                res = res + (1 << k);
                divd = divd - (divs << k);
            }
            k--;
        }
        return (dividend > 0) ^ (divisor > 0) ? -res : res;

    }
}
