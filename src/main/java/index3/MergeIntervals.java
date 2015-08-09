package index3;

import model.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yduan on 2/2/15.
 */
public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0) return intervals;
        Comparator<Interval> BYSTRAT = new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return new Integer(i1.start).compareTo(new Integer(i2.start));
            }
        };
        Collections.sort(intervals, BYSTRAT);
        List<Interval> result = new ArrayList<Interval>();

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval itv : intervals) {
            if (end >= itv.start) {
                end = Math.max(end, itv.end);
            } else {
                result.add(new Interval(start, end));
                start = itv.start;
                end = itv.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }


}
