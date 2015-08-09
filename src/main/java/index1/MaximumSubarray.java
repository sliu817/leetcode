package index1;

/**
 * Created by yduan on 2/2/15.
 */
public class MaximumSubarray {
    public int maxSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int index = 0; index < nums.length; index++) {
            if (sum >= 0) {
                sum = sum + nums[index];
            } else {
                sum = nums[index];
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}
