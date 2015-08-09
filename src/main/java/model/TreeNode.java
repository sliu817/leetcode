package model;

/**
 * Created by yduan on 1/27/15.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode middle;
    public TreeNode right;
    public TreeNode (int x) {
        val = x;
        this.left = this.right = this.middle = null;
    }

}
