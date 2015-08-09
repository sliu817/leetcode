package index1;

/**
 * Created by yduan on 2/2/15.
 */
public class LengthofLastWord {
    public int lengthOfLastWord (String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != 0) {
            i--;
            length++;
        }
        return length;
    }
}
