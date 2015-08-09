package index3;

import java.util.Set;

/**
 * Created by yduan on 1/27/15.
 */
public class WordBreak {

    public  boolean wordBreak(String s, Set<String> dict) {
        boolean[] dp = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (dict.contains(s.substring(0, i + 1)))
                dp[i] = true;
            else {
                for (int k = 0; k < i; k++) {
                    if (dp[k] == true && dict.contains(s.substring(k + 1, i + 1))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[s.length() - 1];
    }
}

