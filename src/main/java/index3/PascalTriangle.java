package index3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yduan on 1/30/15.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        res.add(list);
        for (int i = 0; i < numRows; i++) {
            for (int j = res.get(i).size() -1; j >= 1; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
            list.add(1);
            res.add(new ArrayList<Integer>(list));
        }
        return res;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        for(int i = 0; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--)
                res.set(j, res.get(j) + res.get(j-1));
            res.add(1);
        }
        return res;
    }
}
