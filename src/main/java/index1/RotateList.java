package index1;

import model.ListNode;

/**
 * Created by yduan on 1/29/15.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null) return null;
        int size = 1;
        ListNode p = head;
        while (p.next != null) {
            size++;
            p = p.next;
        }
        ListNode curr = head;
        int pos = size - n % size - 1;
        while (pos > 0 && curr != null) {
            curr = curr.next;
            pos--;
        }
        p.next = head;
        head = curr.next;
        curr.next = null;
        return head;
    }
}
