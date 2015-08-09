package index3;

import model.TreeNode;

import java.util.Stack;

/**
 * Created by yduan on 1/28/15.
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        return sumNumbersHelper(root, 0);
    }

    private int sumNumbersHelper(TreeNode node, int sum) {
        if (node == null) return 0;
        sum = sum * 10 + node.val;

        if (node.left == null && node.right == null)
            return sum;
        return sumNumbersHelper(node.left, sum) + sumNumbersHelper(node.right, sum);
    }

    public int sumNumbersIterative(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> valStack = new Stack<Integer>();
        nodeStack.add(root);
        valStack.add(root.val);
        int base = 0;
        while(!nodeStack.isEmpty() && !valStack.isEmpty()) {
            TreeNode curr = nodeStack.pop();
            base = valStack.pop();
            if (curr.left == null && curr.right == null) {
                sum += base;
            }
            if (curr.right != null) {
                nodeStack.push(curr.right);
                valStack.push(base * 10 + curr.right.val);
            }
            if (curr.left != null) {
                nodeStack.push(curr.left);
                valStack.push(base * 10 + curr.left.val);
            }
        }
        return sum;
    }
}
