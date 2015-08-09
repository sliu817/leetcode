package index3;

import model.TreeLinkNode;

import java.util.LinkedList;
import java.util.Queue;


/**
 * Created by yduan on 1/30/15.
 */
public class PopulatingNextRightPointers {

    public void connect(TreeLinkNode root) {
        TreeLinkNode curr = root;

        while (curr != null) {
            TreeLinkNode nextLevelLeftMost = null;
            TreeLinkNode nextLevelPrev = null;
            // connect next level
            while (curr != null) {
                if (nextLevelLeftMost == null) {
                    nextLevelLeftMost = curr.left != null ? curr.left : curr.right;
                }

                if (curr.left != null) {
                    if (nextLevelPrev != null) {
                        nextLevelPrev.next = curr.left;
                    }
                    nextLevelPrev = curr.left;
                }

                if (curr.right != null) {
                    if (nextLevelPrev != null) {
                        nextLevelPrev.next = curr.right;
                    }
                    nextLevelPrev = curr.right;
                }

                curr = curr.next;
            }

            curr = nextLevelLeftMost;
        }

    }


}
