package index1;

/**
 * Created by yduan on 2/2/15.
 */
public class MergeSortedArray {
    public void merge (int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[length--] = nums2[j--];
            } else {
                nums1[length--] = nums1[i--];
            }
        }

        while (j >= 0) {
            nums1[length--] = nums2[j--];
        }
    }
}
