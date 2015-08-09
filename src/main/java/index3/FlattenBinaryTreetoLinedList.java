package index3;

import model.TreeNode;

import java.util.Stack;

/**
 * Created by yduan on 2/4/15.
 */
public class FlattenBinaryTreetoLinedList {

    public void flatten(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode curr = root;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);

            node.left = null;
            node.right = null;

            if (node != root) {
                curr.right = node;
                curr = curr.right;
            }
        }
    }
}
