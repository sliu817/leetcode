package index3;

import model.ListNode;
import model.TreeNode;

/**
 * Created by yduan on 2/6/15.
 */
public class ConvertSortedListBST {
    public TreeNode sortedListToBST(ListNode head) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        ListNode[] headHold = new ListNode[1];
        headHold[0] = head;
        return listToBST(headHold, 0, length - 1);
    }

    private TreeNode listToBST(ListNode[] headHold, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode left = listToBST(headHold, start, mid - 1);

        TreeNode node = new TreeNode(headHold[0].val);
        headHold[0] = headHold[0].next;

        TreeNode right = listToBST(headHold, mid + 1, end);

        node.left = left;
        node.right = right;

        return node;
    }
}
