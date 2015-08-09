package index5;

import model.TreeNode;

/**
 * Created by yduan on 1/27/15.
 */
public class TrinaryTree {
    public TreeNode root;
    public TrinaryTree() {
        root = null;
    }
    public TrinaryTree(TreeNode n) {
        root = n;
    }

    public TreeNode insert(TreeNode node, int num) {
        if (node == null) {
            node = new TreeNode(num);
        } else if (num < node.val) {
            node.left = insert(node.left, num);
        } else if (num == node.val) {
            node.middle = insert(node.middle, num);
        } else {
            node.right = insert(node.right, num);
        }
        return node;
    }

    public TreeNode delete(TreeNode root, int target) {
        if (root == null)
            return root;
        //find the root to be deleted
        if (root.val == target) {
            return deleteNode(root);
        } else if (target < root.val) {
            root.left = delete(root.left, target);
        } else {
            root.right = delete(root.right, target);
        }
        return root;
    }

    public static TreeNode deleteNode(TreeNode node) {
        if (node.middle != null) {                   //if has middle child
            node.middle = node.middle.middle;
        }
        if (node.left == null && node.right == null) { //if has no child
            return null;
        } else if (node.right == null) {
            return node.left;
        } else if (node.left == null) {
            return node.right;
        }

        TreeNode curr = node.left;
        while (curr.right != null) {
            curr = curr.right;
        }
        curr.right = node.right;

        return node.left;
    }
}

