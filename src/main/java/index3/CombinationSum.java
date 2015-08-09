package index3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yduan on 2/9/15.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cache = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, cache, res);
        return res;
    }

    private void helper(int[] candidates, int target, int index, List<Integer> cache, List<List<Integer>> res) {
        if (target == 0) {
            res.add(cache);
        }
        if (index > candidates.length - 1 || target < candidates[index]) return;

        for (int i = index; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                List<Integer> temp = new ArrayList<Integer>(cache);
                temp.add(candidates[i]);
                helper(candidates, target - candidates[i], index, temp, res);
            }
        }
    }
}
