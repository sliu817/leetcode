package index1;

import java.util.Arrays;

/**
 * Created by yduan on 8/6/15.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return sorted(s).equals(sorted(t));
    }

    public String sorted(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
