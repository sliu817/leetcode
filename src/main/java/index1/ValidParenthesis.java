package index1;

import java.util.Stack;

/**
 * Created by yduan on 1/27/15.
 */
public class ValidParenthesis {

    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '{') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty())
                    return false;
                char top = stack.pop();
                if (ch == ')' && top != '(' || ch == ']' && ch != '[' || ch == '}' && ch != '{')
                    return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
