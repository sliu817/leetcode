package index1;

/**
 * Created by yduan on 8/6/15.
 *
 *
 * Runtime: O(n) — Moore voting algorithm: We maintain a current candidate and a counter initialized to 0.
 * As we iterate the array, we look at the current element x:
 *      If the counter is 0, we set the current candidate to x and the counter to 1.
 *      If the counter is not 0, we increment or decrement the counter based on whether x is the current candidate.
 * After one pass, the current candidate is the majority element. Runtime complexity = O(n).
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int cnt = 0;

        for (int num: nums) {
            if (cnt == 0) {
                ans = num;
                cnt = 1;
            } else if (ans == num) {
                cnt += 1;
            } else {
                cnt -= 1;
            }
        }

        return ans;
    }

}
