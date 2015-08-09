package index3;

import model.TreeNode;

import java.util.Stack;

/**
 * Created by yduan on 2/13/15.
 */
public class BinarySearchTreeIterator {
    //mimic inorder traversal
    private Stack<TreeNode> stack = new Stack<TreeNode>();

    private void pushLeft(TreeNode x) {
        while (x !=  null) {
            stack.push(x);
            x = x.left;
        }
    }
    public BinarySearchTreeIterator(TreeNode root) {
        pushLeft(root);

    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode x = stack.pop();
        pushLeft(x.right);
        return x.val;
    }
}
