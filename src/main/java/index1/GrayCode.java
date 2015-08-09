package index1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yduan on 2/3/15.
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>(Arrays.asList(0));

        for (int i = 0; i < n; i++) {
            for (int j = res.size() - 1; j >= 0; j--) {
                res.add(res.get(j) + (1 << i));
            }
        }

        return res;
    }
}
