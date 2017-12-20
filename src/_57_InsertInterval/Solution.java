package _57_InsertInterval;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hzhuangyan1 on 2017/12/20.
 */

class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return 0;
            }
        });
        List<Interval> res = new LinkedList();
        boolean merge = true;
        for(Interval inte : intervals){
            if(newInterval.start <= inte.start && merge){
                mergeLast(res, newInterval);
                merge = false;
            }
            mergeLast(res, inte);
        }
        if(res.size() == 0 || merge)
            mergeLast(res, newInterval);
        return res;
    }

    public void mergeLast(List<Interval> intervals, Interval newInterval) {
        int s = intervals.size();
        if(s == 0){
            intervals.add(newInterval);
            return;
        }
        Interval last = intervals.get(s - 1);
        if(last.start > newInterval.end){
            intervals.add(s -1, newInterval);
        }else if(last.start <= newInterval.end && last.start > newInterval.start){
            last.start = newInterval.start;
        }
        if(last.start <= newInterval.start && last.end >= newInterval.end){
            return;
        }
        if(last.end >= newInterval.start && last.end < newInterval.end){
            last.end = newInterval.end;
        }else if((last.end < newInterval.start)){
            intervals.add(newInterval);
        }
    }

    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

}