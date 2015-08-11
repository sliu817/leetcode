package index1;

/**
 * Created by yduan on 2/11/15.
 */
public class AddBinary {
    public static String addBinary(String a, String b)
    {
        if (a == null || b == null) return null;

        int i = a.length() - 1, j = b.length() - 1;

        if (i == -1 || j == -1 ) {
            return null;
        }

        String result = "";
        int sum = 0;
        while (i >= 0 || j >= 0) {
            if(i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result = (sum % 2 == 0 ? "0" : "1") + result;
            sum /= 2;
        }

        return  sum==0 ? result : "1" + result;
    }
}
