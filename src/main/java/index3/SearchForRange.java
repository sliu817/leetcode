package index3;

/**
 * Created by yduan on 1/29/15.
 */
public class SearchForRange {
    public int[] searchRange(int[] A, int target) {
        int[] res = new int[2];
        res[0] = searchLeftMost(A, target, true);
        res[1] = searchLeftMost(A, target, false);
        return res;
    }

    private int searchLeftMost(int[] A, int target, boolean leftMost) {
        int start = 0, end = A.length - 1;
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (A[mid] == target) {
                if(leftMost) {
                    if (mid == 0 || A[mid] > A[mid - 1])
                        return mid;
                    else
                        end = mid - 1;
                } else {
                    if (mid == A.length - 1 || A[mid] < A[mid + 1])
                        return mid;
                    else
                        start = mid + 1;
                }
            } else if (A[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
