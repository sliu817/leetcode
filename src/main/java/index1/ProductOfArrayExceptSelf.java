package index1;

/**
 * Created by yduan on 8/8/15.
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int prod = 1;
        for (int index = 0; index < nums.length;  ++index) {
            ans[index] = prod;
            prod *= nums[index];
        }

        prod = 1;
        for (int index = nums.length - 1; index >= 0; --index) {
            ans[index] *= prod;
            prod *= nums[index];
        }

        return ans;
    }
}
