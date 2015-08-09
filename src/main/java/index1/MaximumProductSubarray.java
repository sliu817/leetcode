package index1;

/**
 * Created by yduan on 2/2/15.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] A) {
        int maxproduct = A[0];
        int maxTemp = A[0];
        int minTemp = A[0];

        for (int i = 1; i < A.length; i++) {
            int a = A[i] * maxTemp;
            int b = A[i] * minTemp;
            maxTemp = Math.max(Math.max(a, b), A[i]);
            minTemp = Math.max(Math.min(a, b), A[i]);
            maxproduct = Math.max(maxTemp, maxproduct);
        }
        return maxproduct;
    }
}
