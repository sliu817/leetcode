package index1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yduan on 8/9/15.
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n = sum(getDigits(n));
            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    public int sum(Iterable<Integer> arr) {
        int sum = 0;
        for (int value: arr) {
            sum = sum + value*value;
        }
        return sum;
    }

    public List<Integer> getDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n = n / 10;
        }

        return digits;
    }

}
