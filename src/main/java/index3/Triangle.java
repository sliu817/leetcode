package index3;

import java.util.List;

/**
 * Created by yduan on 1/27/15.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int [] dp = new int[row];

        for (int i = row - 1; i >= 0; i--) {
            int col = triangle.get(i).size();
            for (int j = 0; j < col; j++) {
                if (i == row - 1) {
                    dp[j] = triangle.get(i).get(j);
                    continue;
                }
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }
}
