package index1;

/**
 * Created by yduan on 1/28/15.
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int pos0 = -1, curr = 0, pos2 = nums.length;

        while (curr < pos2) {
            if (nums[curr] == 0) {
                swap(nums, pos0 + 1, curr);
                pos0++;
                curr++;
            } else if (nums[curr] == 1) {
                curr++;
            } else {
                swap(nums, curr, pos2 - 1);
                pos2--;
            }
        }
    }

    private void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

}
