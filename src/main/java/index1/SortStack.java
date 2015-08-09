package index1;

import java.util.Stack;

/**
 * Created by yduan on 1/28/15.
 */
public class SortStack {
    public Stack<Integer> sort(Stack<Integer> s) {

        Stack<Integer> r = new Stack<Integer>();

        while (!s.isEmpty()) {
            int temp = s.pop();
            while (!r.isEmpty() && temp < r.peek())
                s.push(r.pop());
            r.push(temp);
        }
        return r;

    }
}
