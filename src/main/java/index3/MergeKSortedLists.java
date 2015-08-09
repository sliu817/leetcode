package index3;

import model.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by yduan on 2/2/15.
 */
public class MergeKSortedLists {

    public ListNode mergeKLists (ArrayList<ListNode> lists) {
        if (lists.size() == 0) return null;

        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val) return -1;
                else if (o1.val > o2.val) return 1;
                else return 0;
            }
        };

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.size(), comparator);

        for (ListNode node : lists) {
            if (node != null) minHeap.add(node);
        }

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) {
                minHeap.add(node.next);
            }
        }

        return dummy.next;
    }
}
