package index1;

import model.ListNode;

/**
 * Created by yduan on 2/2/15.
 */
public class LinkedListCycleII {
    public ListNode detectCycle (ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (head != slow) {
                    head = head.next;
                    slow = slow.next;
                }
                return head;
            }
        }
        return null;
    }
}
