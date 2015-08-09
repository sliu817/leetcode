package index3;

import java.util.HashMap;

/**
 * Created by yduan on 2/11/15.
 */
public class FractiontoRecurringDecimal {
    //once the remainder starts repeating, so does the divided result.
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        if (denominator == 0) return "";
        String ans = "";
        if ((numerator < 0) ^ (denominator < 0)) {
            ans += "-";
        }
        long num = numerator, deno = denominator;
        num = Math.abs(num);
        deno = Math.abs(deno);
        long res = num / deno;
        long remainder = num % deno;
        ans += String.valueOf(res);
        if (remainder == 0) return ans;

        ans += ".";
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int loopIndex = map.get(remainder);
                String start = ans.substring(0, loopIndex);
                String end = ans.substring(loopIndex, ans.length());
                ans = start + "(" + end + ")";
                return ans;
            }
            map.put(remainder, ans.length());
            res = (remainder * 10) / deno;
            ans += String.valueOf(res);
            remainder = (remainder * 10) % deno;
        }
        return ans;
    }
}
