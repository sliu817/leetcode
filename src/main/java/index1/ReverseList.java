package index1;

import model.ListNode;

/**
 * Created by yduan on 1/29/15.
 */
public class ReverseList {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode succ = curr.next;
            curr.next = prev;
            prev = curr;
            curr = succ;
        }

        return prev;
    }

    public ListNode reverseRecursively (ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode rest = head.next;
        ListNode remainingList = reverseRecursively(rest);

        rest.next = head;
        head.next = null;

        return remainingList;

    }
}
