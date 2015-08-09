package index3;

/**
 * Created by yduan on 2/4/15.
 */
public class FindPeakElement {
    public int findPeakElement (int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((mid == 0 || nums[mid - 1] <= nums[mid]) &&
                    (mid == nums.length - 1 || nums[mid] >= nums[mid + 1])) {
                return mid;
            } else if (mid > 0 && nums[mid - 1] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return mid;
    }
}
