package index1;

import model.ListNode;

/**
 * Created by yduan on 1/30/15.
 */
public class RemoveNthEndofList {
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = head;
        int size = 0;
        while (p != null) {
            p = p.next;
            size++;
        }
        int k = size - n;
        ListNode curr = dummy;
        while (k > 0 ) {
            curr = curr.next;
            k--;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        while (n > 0) {
            fast = fast.next;
            n--;
        }

        ListNode slow = dummy;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
