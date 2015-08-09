package index3;

/**
 * Created by yduan on 2/4/15.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] A) {

        for (int i = 0; i < A.length; i++) {
            while (A[i] != i + 1) {
                if (A[i] <= 0 || A[i] > A.length || A[i] == i + 1)
                    break;

                int temp = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = temp;
            }
        }

        for (int j = 0; j < A.length; j++) {
            if (A[j] != j + 1)
                return j + 1;
        }
        return A.length - 1;
    }
}
