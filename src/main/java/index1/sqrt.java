package index1;

/**
 * Created by yduan on 1/28/15.
 */
public class sqrt {
    public static int sqrt(int x) {
        if (x < 2) return x;
        int start = 0, end = x / 2 + 1;
        while (end - start > 1) {
            int mid = start + (end- start) / 2;
            int div = x / mid;
            if (mid == div) return mid;
            else if (mid > div)
                end = mid;
            else
                start = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(26));
    }
}
