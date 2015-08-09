package index1;

/**
 * Created by yduan on 2/3/15.
 */
public class IntegerToRoman {
    public String intToRoman (int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letter = {"M", "CM", "D", "CD", "C","XC","L","XL","X","IX","V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0 ) {
            while (num >= val[i]) {
                sb.append(letter[i]);
                num = num - val[i];
            }
            i++;
        }
        return sb.toString();
    }
}
