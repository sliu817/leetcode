package index1;

/**
 * Created by yduan on 8/15/15.
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n - 1)) == 0 );
    }

    public static void main(String[] args) {
        System.out.println(0 & -1);
    }


}
