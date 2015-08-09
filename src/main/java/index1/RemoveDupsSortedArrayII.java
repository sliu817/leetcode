package index1;

/**
 * Created by yduan on 1/30/15.
 */
public class RemoveDupsSortedArrayII {
    public int removeDuplicates(int[] A) {
        if (A == null) {
            return 0;
        }

        if (A.length <= 2) {
            return A.length;
        }

        int tail = 0;
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[tail] || count < 2) {
                A[tail + 1] = A[i];
                tail++;

                count = A[i] != A[tail] ? 1 : 2;
            }
        }

        return tail + 1;
    }
}
