package index1;

import model.ListNode;

/**
 * Created by yduan on 2/3/15.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        dummyHead.next = head;
        ListNode curr = head;
        while (curr != null) {
            ListNode node = curr;

            node.next = null;
            insertSort(dummyHead, curr);
            curr = curr.next;
        }
        return dummyHead.next;
    }

    private void insertSort(ListNode dummy, ListNode node) {
        ListNode curr = dummy;

        while (curr.next != null && curr.next.val < node.val) {
            curr = curr.next;
        }
        ListNode succ = curr.next;
        curr.next = node;
        node.next = succ;
    }
}
