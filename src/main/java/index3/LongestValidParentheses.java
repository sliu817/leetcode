package index3;

import java.util.Stack;

/**
 * Created by yduan on 2/2/15.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                    longest = Math.max(stack.isEmpty() ? i + 1 : i - stack.peek(), longest);
                } else {
                    stack.push(i);
                }
            }
        }
        return longest;
    }
}
