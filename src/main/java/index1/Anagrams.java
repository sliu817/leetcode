package index1;

import java.util.*;

/**
 * Created by yduan on 2/11/15.
 */
public class Anagrams {
    public List<String> anagrams(String[] strs) {
        List<String> result = new ArrayList<String>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str: strs)
        {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String key = new String(cs);
            if(map.containsKey(key))
                map.get(key).add(str);
            else
            {
                List<String> list = new ArrayList<String>();
                list.add(str);
                map.put(key, list);
            }
        }

        for(List<String> list: map.values())
        {
            if(list.size() > 1)
                result.addAll(list);
        }
        return result;
    }
}
