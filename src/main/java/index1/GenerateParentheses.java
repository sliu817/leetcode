package index1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yduan on 2/3/15.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }

        String str = "";
        generate(ans, str, n, n);

        return ans;
    }

    private void generate(List<String> ans, String str, int left, int right) {
        if (left < 0 || left > right) {
            return;
        }

        if (left == 0 && right == 0) {
            ans.add(str);
        } else {
            generate(ans, str + "(", left - 1, right);
            generate(ans, str + ")", left, right - 1);
        }
    }

 }
