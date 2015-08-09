package index1;

/**
 * Created by yduan on 1/30/15.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int num = Math.abs(x);
        int res = 0;
        while (num > 0) {
            int rightmost = num % 10;
            if (Integer.MAX_VALUE / 10 < res) //do not need to check if ret == 214748364, why?
                return 0;
            res = res * 10 + rightmost;
            num = num / 10;
        }
        return x > 0 ? res : -res;
    }
}
