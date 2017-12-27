package _220_ContainsDuplicateIII;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by hzhuangyan1 on 2017/12/27.
 */
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            if (i <= k){
                if (find(sortedSet, nums[i], t))
                    return true;
            }else {
                sortedSet.remove(nums[i - k - 1]);
                if (find(sortedSet, nums[i], t))
                    return true;
            }
        }
        return false;
    }
    public boolean find(SortedSet<Integer> sortedSet, int value, int comp) {
        SortedSet<Integer> head = sortedSet.headSet(value);
        SortedSet<Integer> tail = sortedSet.tailSet(value);
        if (head.size() > 0){
            Integer s = head.last();
            if (comp >= Math.abs((long) value - s))
                return true;
        }
        if (tail.size() > 0){
            Integer l = tail.first();
            if (comp >= Math.abs((long) value - l))
                return true;
        }
        sortedSet.add(value);
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,5,10};
        System.out.println(solution.containsNearbyAlmostDuplicate(nums, 1, 3));
    }
}
