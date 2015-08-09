package index1;

/**
 * Created by yduan on 2/3/15.
 */
public class ImplementstrStr {
    public String strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) return haystack;
        if (n < m) return null;

        for (int i = 0; i < n - m + 1; i++) {
            int start = 0;
            for (int k = i; start < m && haystack.charAt(k) == needle.charAt(k); k++){
                start++;
            }
            if (start == m)
                return haystack.substring(i, n);
        }
        return null;
    }
}
