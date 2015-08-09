package index3;

import model.TreeNode;

import java.util.Stack;

/**
 * Created by yduan on 2/9/15.
 */
public class ConvertBSTtoDoubleLinkedList {
    public TreeNode convertBST2DoubleList(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;

        TreeNode head = null;
        TreeNode prev = null;
        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                if (prev != null) {
                    prev.right = curr;
                    curr.left = prev;
                }
                if (head == null) {
                    head = curr;
                }
                prev = curr;
                curr = curr.right;
            }
        }
        prev.right = head;
        head.left = prev;
        return head;
    }

    public TreeNode convertBST2DoubleListRecursive(TreeNode root) {
        root = convert(root);
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    private TreeNode convert (TreeNode root) {
        if (root == null || root.left == null || root.right == null) return root;
        TreeNode temp = null;
        if (root.left != null) {
            temp = convert(root.left);
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = root;
            root.left = temp;
        }
        if (root.right != null) {
            temp = convert(root.right);
            while (temp.left != null) {
                temp = temp.left;
            }
            temp.left = root;
            root.right = temp;
        }
        return root;

    }
}
