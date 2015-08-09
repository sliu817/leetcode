package index5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by yduan on 1/27/15.
 */
public class InfixPostfixExpression {
    //read 'digit', write it to output;
    //read '(', push it to stack;
    //read ')', repeat: pop operators in stack until find a matching (, pop item add to output;
    //read '+-*/', if stack is empty, push this operator; otherwise, repeat: pop operators until find the low priority
    //operator, that means first add all high priority operator, then add the current one. if(opTop >= opThis),
    //output opTop.

    public List<String> infixToPostExpr(String expr) {
        String operator = "+-*/()";
        StringTokenizer tokenizer = new StringTokenizer(expr, operator, true);
        List<String> postfix = new ArrayList<String>();
        Stack<String> op = new Stack<String>();

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (!operator.contains(token))     //read a operand
                postfix.add(token);
            else if (token.equals("("))          //read a left
                op.push(token);
            else if (token.equals(")")) {
                while (!op.peek().equals("("))  //read a right
                    postfix.add(op.pop());
                op.pop();
            } else {                           // =read a operator
                while (!op.isEmpty() && getPriority(token) <= getPriority(op.peek()))
                    postfix.add(op.pop());
                op.add(token);
            }
        }
        while (!op.isEmpty())
            postfix.add(op.pop());

        return postfix;
    }

    public double evaluatePostfix(List<String> postfix) {
        String operator = "+-*/";
        Stack<Double> stack = new Stack<Double>();
        for(String token : postfix) {
            if (!operator.contains(token)) {
                stack.push(Double.valueOf(token));
            } else {
                Double val2 = stack.pop();
                Double val1 = stack.pop();
                stack.push(calculate(val1, val2, token));
            }
        }
        return stack.pop();
    }

    public static int getPriority(String op) {
        if (op.equals("*") || op.equals("/"))
            return 2;
        else if (op.equals("+") || op.equals("-"))
            return 1;
        else
            return 0;
    }

    public static double calculate(Double val1, Double val2, String op) {
        Double res = 0.0;
        if (op.equals("+"))
            return val1 + val2;
        else if (op.equals("-"))
            return val1 - val2;
        else if (op.equals("*"))
            return val1 * val2;
        else if (op.equals("/"))
            return val1 / val2;

        return res;
    }

    public static void main(String [] args) {
        InfixPostfixExpression infixPost = new InfixPostfixExpression();
        List<String> post = infixPost.infixToPostExpr("3*(4+5)-6/(1+2)");
        System.out.println(post);
        System.out.println(infixPost.evaluatePostfix(post));
    }

    public static double eval (String expr) {
        int length = expr.length();
        int index = Math.max(expr.lastIndexOf('+'), expr.lastIndexOf('-'));
        if (index != -1) {
            double left = eval(expr.substring(0, index));
            double right = eval(expr.substring(index + 1, length));
            return expr.charAt(index) == '+' ? left + right : left - right;
        }

        index = Math.max(expr.lastIndexOf('*'), expr.lastIndexOf('/'));
        if (index != -1) {
            double left = eval(expr.substring(0, index));
            double right = eval(expr.substring(index + 1, length));
            return expr.charAt(index) == '*' ? left * right : left / right;
        }
        return Double.valueOf(expr.trim());

    }
}
