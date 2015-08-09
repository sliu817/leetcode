package index1;

/**
 * Created by yduan on 2/2/15.
 */
public class MinimumWindowSubstring {
    public String minWindow(String S,String T) {
        int[] needFind = new int[256];
        int[] hasFind = new int[256];

        for (int i = 0; i < T.length(); i++) {
            needFind[T.charAt(i)]++;
        }

        int left = 0, count = 0, min = Integer.MAX_VALUE;
        String res = "";
        for (int i = 0; i < S.length(); i++) {
            if (needFind[S.charAt(i)] == 0) {
                continue;
            }
            hasFind[S.charAt(i)]++;
            if (hasFind[S.charAt(i)] <= needFind[S.charAt(i)]){
                count++;
            }
            if (count == T.length()) {
                while(hasFind[S.charAt(left)] > needFind[S.charAt(left)] ||
                        needFind[S.charAt(left)] == 0) {
                    if (hasFind[S.charAt(left)] > needFind[S.charAt(left)]) {
                        hasFind[S.charAt(left)]--;
                    }
                    left++;
                }
                    if (min > i - left + 1) {
                    min = i - left + 1;
                    res = S.substring(left, i + 1);
                }
            }

        }
        return res;
    }
}
