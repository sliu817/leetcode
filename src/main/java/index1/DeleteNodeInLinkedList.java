package index1;

import model.ListNode;

/**
 * Created by yduan on 8/2/15.
 */
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
