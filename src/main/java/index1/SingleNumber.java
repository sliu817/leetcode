package index1;

/**
 * Created by yduan on 8/2/15.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int index = 1; index < nums.length; ++index) {
            ans ^= nums[index];
        }

        return ans;
    }
}
