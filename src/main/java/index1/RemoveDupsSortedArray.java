package index1;

/**
 * Created by yduan on 1/30/15.
 */
public class RemoveDupsSortedArray {
    public int removeDuplicates(int [] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int tail = 0; // [0..tail] is non-duplicate
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[tail]) {
                nums[tail + 1] = nums[i];
                tail++;
            }
        }

        return tail + 1;
    }
}
