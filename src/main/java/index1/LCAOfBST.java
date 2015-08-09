package index1;

import model.TreeNode;

/**
 * Created by yduan on 8/3/15.
 */
public class LCAOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        int maxVal = Math.max(p.val, q.val);
        int minVal = Math.min(p.val, q.val);
        while (!(node.val >= minVal && node.val <= maxVal)) {
            if (node.val > maxVal) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        return node;
    }
}
