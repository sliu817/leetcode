package index1;

import model.ListNode;



/**
 * Created by yduan on 1/28/15.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode succ = curr.next.next;
            prev.next = curr.next;
            prev.next.next = curr;
            curr.next = succ;
            prev = curr;
            curr = succ;
        }

        return dummy.next;
    }

}
