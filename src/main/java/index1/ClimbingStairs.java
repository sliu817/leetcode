package index1;

/**
 * Created by yduan on 2/11/15.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1 || n == 2) {
            return n;
        }

        int a = 1, b = 2, c = a + b;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
