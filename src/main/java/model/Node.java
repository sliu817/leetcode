package model;

/**
 * Created by yduan on 2/3/15.
 */
public class Node {
    public int key;
    public int val;
    public Node prev = null;
    public Node next = null;
    public Node (int key, int val) {
        this.key = key;
        this.val = val;
    }
}
