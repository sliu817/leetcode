package index5;


import model.Node;

import java.util.HashMap;

/**
 * Created by yduan on 2/2/15.
 */
public class LRUCache {
    private int capacity;
    HashMap<Integer, Node> hm = new HashMap<Integer, Node>();

    private Node dummyHead = new Node(0, 0);
    private Node dummyTail = new Node(0, 0);
    private int listSize = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        dummyHead.next = dummyTail;
        dummyHead.prev = dummyTail;
        dummyTail.next = dummyHead;
        dummyTail.prev = dummyHead;
    }

    public int get(int key) {
        if (!hm.containsKey(key))
            return -1;
        Node node = hm.get(key);
        if (node != dummyHead.next) {
            this.cut(node);
            this.offer(node);
        }
        return node.val;
    }

    public void set(int key, int value) {
        if (hm.containsKey(key)) {
            this.get(key);
            hm.get(key).val = value;
        } else {
            Node node = new Node(key, value);
            this.offer(node);
            hm.put(key, node);
            this.listSize++;
            if (this.listSize > this.capacity) {
                hm.remove(dummyTail.prev.val);
                this.cut(dummyTail.prev);
                this.listSize--;
            }
        }
    }

    private void offer(Node node) {
        Node succ = dummyHead.next;
        node.next = succ;
        succ.prev = node;
        dummyHead.next = node;
        node.prev = dummyHead;
    }

    private void cut(Node node) {
        Node prevNode = node.prev;
        prevNode.next = node.next;
        node.next.prev = prevNode;
    }
}
