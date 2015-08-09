package index3;

import model.ListNode;

/**
 * Created by yduan on 1/29/15.
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
       if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforeR = dummy;
        int k = m;
        while (k > 1) {
            beforeR = beforeR.next;
            k--;
        }
        ListNode curr = beforeR.next;
        ListNode endR = curr;
        ListNode prev = null;
        ListNode succ = null;
        k = n - m + 1;
        while (k > 0 && curr != null) {
            succ = curr.next;
            curr.next = prev;
            prev = curr;
            curr = succ;
            k--;
        }
        beforeR.next = prev;
        endR.next = curr;

        return dummy.next;
    }
}
