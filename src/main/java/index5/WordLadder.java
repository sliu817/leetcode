package index5;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yduan on 1/27/15.
 */
public class WordLadder {

    public int ladderLength (String start, String end, HashSet<String> dict) {
        int levels = 0;
        Queue<String> parent = new LinkedList<String>();
        parent.add(start);

        while (!parent.isEmpty()) {
            levels++;
            Queue<String> nextLevel = new LinkedList<String>();
            while (!parent.isEmpty()) {
                StringBuilder curr = new StringBuilder(parent.poll());
                for (int i = 0; i < curr.length(); i++) {
                    char temp = curr.charAt(i);
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == temp) continue;
                        curr.setCharAt(i, ch);
                        String newstr = curr.toString();
                        if (newstr.equals(end))
                            return levels + 1;
                        if (dict.contains(newstr)) {
                            dict.remove(newstr);
                            nextLevel.add(newstr);
                        }

                    }
                    curr.setCharAt(i, temp);
                }
            }
            parent = nextLevel;
        }
        return 0;

    }
}
