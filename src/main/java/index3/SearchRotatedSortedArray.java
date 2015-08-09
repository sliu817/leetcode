package index3;

/**
 * Created by yduan on 1/29/15.
 */
public class SearchRotatedSortedArray {
    public int search (int[] A, int target) {
        int start = 0;
        int end =  A.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == target) return mid;
            else if (A[start] <= A[mid]) {//left sorted: be sure '<='
                if (target >= A[start] && target < A[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > A[mid] && target <= A[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    public boolean search2(int[] A, int target) {
        int start = 0, end = A.length - 1;
        while (start < end && A[start]== A[end]) {
            start++;
            end--;
        }
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (A[mid] == target) return true;
            else if (A[start] <= A[mid]) {
                if (target >= A[start] && target < A[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }else {
                if (target > A[mid] && target <= A[end])
                    start = mid - 1;
                else
                    end = mid + 1;
            }
        }
        return false;
    }
}
