package index3;

import model.RandomListNode;

/**
 * Created by yduan on 2/4/15.
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        //step1: copy each node
        RandomListNode curr = head;
        while (curr != null) {
            RandomListNode node = new RandomListNode(curr.label);
            node.next = curr.next;
            curr.next = node;
            curr = node.next;
        }

        //step2: copy pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        //step3: separate
        RandomListNode copiedHead = head.next;
        RandomListNode pre = head;
        curr = head.next;
        while (curr != null) {
            pre.next = curr.next;
            pre = curr;
            curr = curr.next;
        }

        return copiedHead;
    }

    public RandomListNode copyRandomListHashMap(RandomListNode head) {
        return head;
    }
}
