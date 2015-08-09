package index3;

import java.util.HashMap;

/**
 * Created by yduan on 2/2/15.
 */
public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstringWithoutRepeat(String s) {
        boolean[] flag = new boolean[256];
        int ans = 0, j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!flag[s.charAt(i)]) {
                flag[s.charAt(i)] = true;
            } else {
                ans = Math.max(ans, i - 1);
                for (int k = j; k < i; k++) {
                    if (s.charAt(k) == s.charAt(i)) {
                        j = k + 1;
                        break;
                    }
                    flag[s.charAt(k)] = false;
                }
            }
        }
        return Math.max(s.length() - j, ans);
    }
    public int lengthOfLongestSubstring (String s) {
        int max = 0;
        int length = 0;
        HashMap<Character, Integer> index = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!index.containsKey(temp)) {
                index.put(temp, i);
                length++;
                max = Math.max(length, max);
            } else {
                i = index.get(temp);
                index.clear();
                length = 0;
            }
        }
        return max;
    }
}
