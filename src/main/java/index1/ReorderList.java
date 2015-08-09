package index1;

import model.ListNode;

/**
 * Created by yduan on 1/30/15.
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        //separate in half
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast.next!=null&& fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l2 = slow.next;
        slow.next = null;
        //reverse second half;
        ListNode prev = null;
        ListNode curr = l2;
        while (curr != null) {
            ListNode succ = curr.next;
            curr.next = prev;
            prev = curr;
            curr = succ;
        }
        //merge two halves
        ListNode l1 = head;
        l2 = prev;
        while (l1 != null && l2 != null) { //n(h1)-n(h2)== 0 or 1.
            ListNode succ1 = l1.next;
            ListNode succ2 = l2.next;
            l1.next = l2;
            l2.next = succ1;
            l1 = succ1;
            l2 = succ2;
        }

    }
}
