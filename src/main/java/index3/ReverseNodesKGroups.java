package index3;

import model.ListNode;

/**
 * Created by yduan on 1/29/15.
 */
public class ReverseNodesKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode beforeR = new ListNode(0);
        beforeR.next = head;
        ListNode keepHead = beforeR;
        ListNode curr = head, prev = null, succ = null;
        while (curr != null) {
            ListNode endR = curr;
            int i = 1;
            while (i <= k && curr != null) {
                curr = curr.next;
                i++;
            }
            if (i <= k) break;
            curr = endR;
            while (i <= k) {
                succ = curr.next;
                curr.next = prev;
                prev = curr;
                curr = succ;
                i++;
            }
            beforeR.next = prev;
            endR.next = curr;
            beforeR = endR;
        }
        return keepHead.next;

    }
}
