package index1;

/**
 * Created by yduan on 8/3/15.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int accumulate = 0;
        for (int index = 0; index < s.length(); index++) {
            accumulate = accumulate * 26 + s.charAt(index) - 'A' + 1;
        }
        return accumulate;
    }
}
