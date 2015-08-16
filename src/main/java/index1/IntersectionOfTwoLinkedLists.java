package index1;

import model.ListNode;

/**
 * Created by yduan on 8/13/15.
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode left = headA, right = headB;
        while (left != null && right != null) {
            left = left.next;
            right = right.next;
        }

        ListNode left2 = headA, right2 = headB;

        if (left == null) {
            right2 = move(right2, right);
        } else {
            left2 = move(left2, left);
        }

        while (left2 != null && right2 != null && left2 != right2) {
            left2 = left2.next;
            right2 = right2.next;
        }

        return left2;
    }

    private ListNode move(ListNode node, ListNode sentinel) {
        while (sentinel != null) {
            node = node.next;
            sentinel = sentinel.next;
        }

        return node;
    }


}
