package index1;

/**
 * Created by yduan on 1/30/15.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int tail = 0;

        if (nums == null || nums.length == 0) {
            return tail;
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                nums[tail++] = nums[index];
            }
        }

        return tail;
    }
}
