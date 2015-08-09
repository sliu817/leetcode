package index3;

/**
 * Created by yduan on 1/29/15.
 */
public class ReverseWords {
    public String reverseWords(String s) {
        if (s.length() == 0) return "";
        String[] strs = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i]).append(" ");
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }

    public String reverseWords2(String s) {

        StringBuilder reversed = new StringBuilder();

        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                j = i;
            }
            else if (i == 0 || s.charAt(i - 1) == ' ') {
                if (reversed.length() != 0)
                    reversed.append(' ');
                reversed.append(s.substring(i, j));
            }
        }

        return reversed.toString();
    }
}
