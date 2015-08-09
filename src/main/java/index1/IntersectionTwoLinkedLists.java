package index1;

import model.ListNode;

/**
 * Created by yduan on 2/3/15.
 */
public class IntersectionTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int asize = 0, bsize = 0;
        ListNode alist  = headA;
        while (alist != null) {
            asize++;
            alist = alist.next;
        }
        ListNode blist = headB;
        while (blist != null) {
            bsize++;
            blist = blist.next;
        }
        int k = Math.abs(asize - bsize);
        ListNode longlist = asize > bsize ? headA : headB;
        while (k > 0) {
            longlist = longlist.next;
            k--;
        }
        ListNode shortlist = asize > bsize ? headB : headA;

        while (longlist != null && shortlist != null) {
            if (longlist == shortlist) return longlist;
            longlist = longlist.next;
            shortlist = shortlist.next;
        }
        return null;

    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) return null;
        if (headA == null || headB == null) return null;
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa!= null && pb!= null) {
            pa = pa.next;
            pb = pb.next;
        }
        ListNode longlist = pa == null ? headB : headA;
        ListNode shortlist = pa == null ? headA : headB;
        ListNode q = pa == null ? pb : pa;
        while (longlist != null && q != null) {
            longlist = longlist.next;
            q = q.next;
        }
        while (shortlist != null && longlist != null) {
            if (shortlist == longlist)
                return shortlist;
            shortlist = shortlist.next;
            longlist = longlist.next;
        }
        return null;


    }
}
