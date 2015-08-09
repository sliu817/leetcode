package index1;


import model.TreeNode;

import java.util.Stack;

/**
 * Created by yduan on 1/29/15.
 */
public class SameTree {

    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree1(p.left, q.left) && isSameTree1(p.right, q.right);
    }

    public boolean isSameTree2(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(p); stack.add(q);

        while (!stack.isEmpty()) {
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();

            if (n1 == null && n2 == null) {
                continue;
            }

            if (n1 != null && n2 != null && n1.val == n2.val) {
                stack.push(n1.left);
                stack.push(n2.left);
                stack.push(n1.right);
                stack.push(n2.right);
            } else {
                return false;
            }
        }

        return true;
    }

}
