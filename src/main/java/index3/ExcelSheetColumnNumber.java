package index3;

/**
 * Created by yduan on 2/12/15.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            val = val + (s.charAt(i) - 'A' + 1) * (int)Math.pow(26, s.length() - 1 - i);
        }
        return val;
    }
}
