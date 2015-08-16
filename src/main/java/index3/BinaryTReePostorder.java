package index3;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by yduan on 2/11/15.
 */
public class BinaryTReePostorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode visited = root;

        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if ((curr.left == null && curr.right == null) ||
                    curr.left == visited ||
                    curr.right == visited) {
                result.add(curr.val);
                stack.pop();
                visited = curr;
            } else {
                if (curr.right != null) stack.push(curr.right);
                if (curr.left != null) stack.push(curr.left);
            }
        }
        return result;
    }

}
