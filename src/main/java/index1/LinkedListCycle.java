package index1;

import model.ListNode;

/**
 * Created by yduan on 2/2/15.
 */
public class LinkedListCycle {

    public boolean hasCycle (ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
