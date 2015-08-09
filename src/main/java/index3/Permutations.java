package index3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yduan on 1/30/15.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());

        for (int i = 0; i < num.length; i++) {
            List<List<Integer>> cache = new ArrayList<>(ans);
            for (List<Integer> list : ans) {
                for (int j = 0; j <= list.size(); j++) {
                    list.add(j, num[i]);
                    cache.add(new ArrayList<>(list));
                    cache.remove(j);
                }
            }
            ans = cache;
        }
        return ans;
    }

}
