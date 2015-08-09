package index3;

import model.TreeNode;

/**
 * Created by yduan on 1/27/15.
 */
public class ValidBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean checkBST(TreeNode n, int min, int max) {
        if (n == null) return true;
        if (n.val <= min || n.val >= max)
            return false;
        return checkBST(n.left, min, n.val) && checkBST(n.right, n.val, max);
    }


}

