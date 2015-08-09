package index3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yduan on 1/28/15.
 */
public class Subset {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        Arrays.sort(S);
        for (int i = 0; i < S.length; i++) {
            List<List<Integer>> temp = new ArrayList<List<Integer>>(res);
            for (List<Integer> list : res) {
                List<Integer> newlist = new ArrayList<Integer>(list);
                newlist.add(S[i]);
                temp.add(newlist);
            }
            res = temp;
        }
        return res;
    }

    public List<List<Integer>> subsetsDfs(int[] S) {
        Arrays.sort(S);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        dfs(res, list, 0, S);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> list, int k, int[] S) {
        if (k == S.length) {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        dfs(res, list, k + 1, S);
        list.add(S[k]);
        dfs(res, list, k + 1, S);
        res.remove(list.size() - 1);
    }
}
