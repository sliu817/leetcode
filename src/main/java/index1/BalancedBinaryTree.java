package index1;

import model.TreeNode;

/**
 * Created by yduan on 2/11/15.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int delta = Math.abs(maxDepth(root.left) - maxDepth(root.right));

        return delta > 1 ? false : isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode node)
    {
        if(node == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }


    public static boolean checkBinaryTreeIsBalanced(TreeNode root)
    {
        return computeAndCheckHeight(root) != -1;
    }

    public static int computeAndCheckHeight(TreeNode root)
    {
        if (root == null) {
            return 0;
        }

        int leftSubTreeHeight = computeAndCheckHeight(root.left);
        if (leftSubTreeHeight == -1) {
            return -1;
        }

        int rightSubTreeHeight = computeAndCheckHeight(root.right);
        if (rightSubTreeHeight == -1) {
            return -1;
        }

        int heightDifference = Math.abs(leftSubTreeHeight - rightSubTreeHeight);
        return heightDifference > 1 ? -1 : Math.max(leftSubTreeHeight, rightSubTreeHeight) + 1;
    }

}
