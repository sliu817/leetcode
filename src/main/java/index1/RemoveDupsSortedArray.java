package index1;

/**
 * Created by yduan on 1/30/15.
 */
public class RemoveDupsSortedArray {
    public int removeDuplicates(int [] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int tail = 0; // [0..tail] is non-duplicate
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[tail]) {
                A[tail + 1] = A[i];
                tail++;
            }
        }

        return tail + 1;
    }
}
