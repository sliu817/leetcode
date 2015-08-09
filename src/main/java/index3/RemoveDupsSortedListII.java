package index3;

import model.ListNode;

/**
 * Created by yduan on 1/30/15.
 */
public class RemoveDupsSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode (0);
        dummy.next = head;

        ListNode prev = dummy, curr = head;
        while (curr != null && curr.next != null) {
            if ( curr.val != curr.next.val) {
                prev = curr;
                curr = curr.next;
            } else {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        return dummy.next;

    }
}
