package index1;

/**
 * Created by yduan on 2/4/15.
 */
public class CountandSay {

    public String countAndSay (int n) {
        String res = "1";
        while (n > 0) {
            res = count(res);
        }
        return res;
    }

    private String count(String temp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            int count = 1;
            while (i < temp.length() - 1 && temp.charAt(i) == temp.charAt(i + 1)) {
                i++;
                count++;
            }
            sb.append(count);
            sb.append(temp.charAt(i));
        }
        return sb.toString();
    }
}
