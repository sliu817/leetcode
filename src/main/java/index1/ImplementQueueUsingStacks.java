package index1;

import java.util.Stack;

/**
 * Created by yduan on 8/8/15.
 */
public class ImplementQueueUsingStacks {

    Stack<Integer> temp = new Stack<>();
    Stack<Integer> value = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        if (value.isEmpty()) {
            value.push(x);
        } else {
            while (!value.isEmpty()) {
                temp.push(value.pop());
            }

            value.push(x);

            while (!temp.isEmpty()) {
                value.push(temp.pop());
            }
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        value.pop();
    }

    // Get the front element.
    public int peek() {
        return value.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return value.isEmpty();
    }

}
