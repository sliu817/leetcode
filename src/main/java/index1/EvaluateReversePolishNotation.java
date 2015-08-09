package index1;

import java.util.Stack;

/**
 * Created by yduan on 2/4/15.
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if (str == "+" || str =="-" || str == "*" || str == "/") {
                int right = stack.pop();
                int left = stack.pop();
            }
        }
        return stack.pop();
    }

    private int calculate (String op, int left, int right) {
        if (op == "+")
            return left + right;
        else if (op == "-")
            return left - right;
        else if (op == "*")
            return left * right;
        else if (op == "/")
            return left / right;

        return -1;
    }
}
