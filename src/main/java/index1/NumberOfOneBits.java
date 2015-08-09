package index1;

/**
 * Created by yduan on 8/3/15.
 *
 * Brian Kernighan’s Algorithm:
 *    1  Initialize count: = 0
 *    2  If integer n is not zero
 *          (a) Do bitwise & with (n-1) and assign the value back to n
 *              n: = n&(n-1)
 *          (b) Increment count by 1
 *          (c) go to step 2
 *    3  Else return count
 *
 */
public class NumberOfOneBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;

        while (0 != n) {
            n = n & (n - 1);
            ans += 1;
        }

        return ans;
    }
}
