package index3;

/**
 * Created by yduan on 2/4/15.
 */
public class GasStation {

    public int canCompleteCircuit (int[] gas, int[] cost) {
        int sum= 0, total = 0;
        int index = -1;
        for (int i = 0; i < gas.length; i++) {
            sum = sum + (gas[i] - cost[i]);
            total = total + (gas[i] - cost[i]);
            if (sum < 0) {
                index = i;
                sum = 0;
            }
        }
        return total >= 0 ? index + 1 : -1;
    }
}
