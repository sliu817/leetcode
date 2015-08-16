package index1;

/**
 * Created by yduan on 8/15/15.
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        if (n < 0) {
            return -1;
        }

        int cnt = 0;
        for (long factor = 5; n / factor >= 1; factor *= 5) {
            cnt += n / factor;
        }

        return cnt;
    }

}
