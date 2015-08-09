package index1;

import model.Point;

import java.util.HashMap;

/**
 * Created by yduan on 2/2/15.
 */
public class MaxPointsOnaLine {
    public int maxPoints(Point[] points) {
        if (points == null) return 0;
        int ans = 0;
        HashMap<Double, Integer> hm = new HashMap<Double, Integer>();

        for (int i = 0; i < points.length; i++) {
            hm.clear();
            hm.put(Double.MAX_VALUE, 0);
            int duplicate = 1;
            for (int j = 0; j < points.length; j++) {
                if (j == i) continue;
                if (points[i].x == points[j].y && points[i].y == points[j].y) {
                    duplicate++;
                    continue;
                }
                double slope = points[i].x == points[j].x ? Double.MAX_VALUE :
                        (points[j].y - points[i].y) * 1.0 / (points[j].x - points[i].x);
                Integer num = hm.get(slope);
                if (num == null) {
                    hm.put(slope, 1);
                } else {
                    hm.put(slope, num + 1);
                }
            }

            for (Integer value : hm.values()) {
                ans = Math.max(ans, value + duplicate);
            }
        }
        return ans;
    }
}
