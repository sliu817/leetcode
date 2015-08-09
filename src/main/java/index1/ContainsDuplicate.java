package index1;

import java.util.HashSet;

/**
 * Created by yduan on 8/6/15.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if(nums == null) {
            return false;
        }

        HashSet<Integer> set = new HashSet<Integer>();
        for (int num: nums) {
            if(!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}
