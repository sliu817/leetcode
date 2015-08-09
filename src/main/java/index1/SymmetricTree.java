package index1;

import model.TreeNode;


import java.util.Stack;

/**
 * Created by yduan on 1/28/15.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root  == null) return true;
        return isSymmetricHelper(root.left, root.right);
    }
    public boolean isSymmetricHelper(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;
        return isSymmetricHelper(a.left, b.right) && isSymmetricHelper(a.right, b.left);
    }


    public boolean isSymmetricIterative(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> s = new Stack<>();
        s.push(root.left);
        s.push(root.right);

        while (!s.isEmpty()) {
            TreeNode curr1 = s.pop(), curr2 = s.pop();
            if (curr1 == null && curr2 != null || curr1!= null && curr2 == null) {
                return false;
            } else if (curr1 == null && curr2 == null) {
                continue;
            } else {
                if (curr1.val != curr2.val) {
                    return false;
                } else {
                    s.push(curr1.left);
                    s.push(curr2.right);
                    s.push(curr1.right);
                    s.push(curr2.left);
                }
            }
        }

        return true;
    }

}
