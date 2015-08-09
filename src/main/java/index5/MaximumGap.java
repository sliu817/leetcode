package index5;

/**
 * Created by yduan on 2/11/15.
 */
public class MaximumGap {
    public int maximumGap(int[] num) {
        if (num.length < 2) return 0;
        radixSort(num);
        int res = Math.abs(num[1] - num[0]);
        for (int i = 2; i < num.length; i++) {
            if (num[i] - num[i - 1] > res)
                res = Math.abs(num[i] - num[i - 1]);
        }
        return res;
    }

    private void radixSort(int[] num) {
        int max = getMax(num);
        for (int i = 1; max/i > 0; i *= 10) {
            countSort(num, i);
        }
    }

    private int getMax (int[] num) {
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            m = Math.max(m, num[i]);
        }
        return m;
    }

    private void countSort(int[] num, int k) {
        int n = num.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < n; i++) {
            count[(num[i] / k) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i-1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(num[i] / k) % 10] - 1] = num[i];
            count[(num[i] / k) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            num[i] = output[i];
        }
    }
}
