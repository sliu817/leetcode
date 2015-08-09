package index1;

import java.util.HashMap;

/**
 * Created by yduan on 1/27/15.
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int val = target - numbers[i];
            if (map.containsKey(val)) {
                res[0] = map.get(val) + 1;
                res[1] = i + 1;
            } else {
                map.put(numbers[i], i);
            }
        }
        return res;
    }

    //brute force
    public int[] twoSum1(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                    return res;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] a = {2, 7, 11, 15};
        int target = 9;
        int[] res = ts.twoSum(a, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
