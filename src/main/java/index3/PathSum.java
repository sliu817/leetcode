package index3;

import model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yduan on 1/30/15.
 */
public class PathSum {

    public boolean hasPathSum (TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && root.val == sum) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public boolean hasPathSumIterative(TreeNode root, int sum) {
        if (root == null) return false;
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        Queue<Integer> values = new LinkedList<Integer>();
        nodes.add(root);
        values.add(root.val);
        while ( !nodes.isEmpty()) {
            TreeNode curr = nodes.poll();
            int sumVal = values.poll();
            if (curr.left == null && curr.right == null && sumVal == sum)
                return true;
            if (curr.left != null) {
                nodes.add(curr.left);
                values.add(sumVal + curr.left.val);
            }
            if (curr.right != null) {
                nodes.add(curr.right);
                values.add(sumVal + curr.right.val);
            }
        }
        return false;

    }
}
