package index1;

import model.TreeNode;

/**
 * Created by yduan on 2/2/15.
 */
public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }
}
