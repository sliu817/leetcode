package index3;

/**
 * Created by yduan on 1/30/15.
 */
public class Pow {
    public double pow (double x, int n) {
        double res = 1.0;
        double step = x;
        for (int i = Math.abs(n); i > 0; i >>= 1) {
            if ((i & 0x01) > 0)
                res = res * step;
            step *= step;
        }
        return x < 0 ? 1/res : res;
    }
}
