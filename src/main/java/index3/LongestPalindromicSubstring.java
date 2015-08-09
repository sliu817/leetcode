package index3;

/**
 * Created by yduan on 2/2/15.
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome (String s) {
        if (s.length() == 0 || s.length() == 1) return s;
        String longest = s.substring(0, 1);
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            temp = getPalindrome(s, i, i);
            longest = temp.length() > longest.length() ? temp : longest;

            temp = getPalindrome(s, i, i + 1);
            longest = temp.length() > longest.length() ? temp : longest;
        }
        return longest;
    }

    private String getPalindrome(String s, int start, int end) {
        while(start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }
}
