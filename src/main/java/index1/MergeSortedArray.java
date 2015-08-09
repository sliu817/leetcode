package index1;

/**
 * Created by yduan on 2/2/15.
 */
public class MergeSortedArray {
    public void merge (int[] A, int m, int[] B, int n) {
        int newlength = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] < B[j]) {
                A[newlength] = B[j];
                newlength--;
                j--;
            } else {
                A[newlength] = A[i];
                newlength--;
                i--;
            }
        }
        while (j >= 0) {
            A[newlength] = B[j];
            newlength--;
            j--;
        }
    }
}
