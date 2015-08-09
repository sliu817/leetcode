package index3;

import model.TreeNode;

/**
 * Created by yduan on 2/11/15.
 */
public class BinaryTreeMaximumPathSum {
    public int maxPathSum (TreeNode root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        findMax(root, max);
        return max[0];
    }

    private int findMax(TreeNode root, int[] max) {
        if (root == null) return 0;
        int left = Math.max(findMax(root.left, max), 0);
        int right = Math.max(findMax(root.right, max), 0);

        max[0] = Math.max(max[0], left + root.val + right);
        return root.val + Math.max(left, right);
    }
}
