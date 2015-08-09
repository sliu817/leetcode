package index5;

import model.TreeLinkNode;

/**
 * Created by yduan on 1/30/15.
 */
public class PopulatingNextRightPointersII {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode p = root.next;
        while (p != null) {
            if (p.left != null) {
                p = p.left;
                break;
            }else if (p.right != null){
                p = p.right;
                break;
            }
            p = p.next;
        }
        if (root.right != null) {
            root.right.next = p;
        }
        if (root.left != null) {
            root.left.next = root.right == null ? p : root.right;
        }
        connect(root.right);
        connect(root.left);

    }
}
