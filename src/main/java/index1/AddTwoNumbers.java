package index1;

import model.ListNode;

/**
 * Created by yduan on 2/11/15.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode dummyNode = new ListNode(0);
        ListNode head = dummyNode;
        ListNode curr = head;
        int sum = 0;
        while(l1 != null || l2 != null)
        {
            if(l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            sum /= 10;
        }
        if(sum > 0)
            curr.next = new ListNode(sum);

        return dummyNode.next;


    }
}
