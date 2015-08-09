package index1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yduan on 2/13/15.
 */
public class LargestNumber {

    public String largestNumber(int[] num) {
        String[] numstr = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            numstr[i] = String.valueOf(num[i]);
        }

        Comparator<String> comp = new Comparator<String>() {
            public int compare(String x, String y) {
                String s1 = x.concat(y);
                String s2 = y.concat(x);
                return s1.compareTo(s2);
            }
        };
        Arrays.sort(numstr, comp);
        if (numstr[numstr.length - 1].equals("0")) return "0";
        StringBuilder ans = new StringBuilder();
        for (int i = numstr.length - 1; i >= 0; i--) {
            ans.append(numstr[i]);
        }
        return ans.toString();
    }
}
