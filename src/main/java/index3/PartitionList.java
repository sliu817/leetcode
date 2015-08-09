package index3;

import model.ListNode;

/**
 * Created by yduan on 1/30/15.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode curr = preHead;
        ListNode greatHead = new ListNode(0);
        ListNode great = greatHead;
        while (curr.next != null) {
            if (curr.next.val >= x) {
                ListNode succ = curr.next;
                curr.next = curr.next.next;
                great.next = succ;
                succ.next = null;
                great = great.next;

            }else {
                curr = curr.next;
            }
        }
        curr.next = greatHead.next;
        return preHead.next;
    }
}
