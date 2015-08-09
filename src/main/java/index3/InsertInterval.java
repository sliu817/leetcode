package index3;

import model.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yduan on 2/3/15.
 */
public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0)
        {
            res.add(newInterval);
            return res;
        }
        int index = 0;
        for (Interval itv : intervals) {
            if (itv.end < newInterval.start) {
                res.add(itv);
                index++;
            } else if (itv.start > newInterval.end) {
                res.add(itv);
            } else {
                newInterval.start = Math.min(itv.start, newInterval.start);
                newInterval.end = Math.max(itv.end, newInterval.end);
            }
        }
        res.add(index, newInterval);
        return res;
    }
}
