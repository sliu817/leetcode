package index3;


import java.util.HashMap;

/**
 * Created by yduan on 2/2/15.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int length = 0;
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], true);
        }

        for (int i = 0; i < num.length; i++) {
            int max = 1;
            int key = num[i];
            map.remove(num[i]);
            while(map.containsKey(key + 1)) {
                max++;
                map.remove(key + 1);
                key++;
            }
            key = num[i];
            while (map.containsKey(key - 1)) {
                max++;
                map.remove(key - 1);
                key--;
            }
            length = max > length ? max : length;
        }
        return length;
    }

    public int longestConsecutiveMerge(int[] num) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int longest = 1;
        for (int i = 0; i < num.length; i++) {
            if (hm.containsKey(num[i])) continue;
            hm.put(num[i], 1);
            if (hm.containsKey(num[i] - 1)) {
                longest = Math.max (longest, merge(hm, num[i] - 1, num[i]));
            }
            if (hm.containsKey(num[i] + 1)) {
                longest = Math.max(longest, merge(hm, num[i], num[i] + 1));
            }
        }
        return longest;
    }

    private int merge(HashMap<Integer, Integer> hm, int left, int right) {
        int upper =  right + hm.get(right) - 1;
        int lower = left - hm.get(left) + 1;
        int len = upper - lower + 1;
        hm.put(upper, len);
        hm.put(lower, len);
        return len;
    }
}
