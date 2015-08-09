package index3;

/**
 * Created by yduan on 1/27/15.
 */
public class UniqueBST {

    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int sum = 0;
        for (int i = 0; i < n / 2; i++) {
            sum += numTrees(i) * numTrees(n - i - 1);
        }

        sum <<= 1;

        if (n % 2 != 0) {
            int extra = numTrees(n / 2);
            sum += extra * extra;
        }

        return sum;
    }
}
