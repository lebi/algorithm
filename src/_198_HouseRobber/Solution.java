package _198_HouseRobber;

/**
 * Created by hzhuangyan1 on 2017/12/20.
 */
public class Solution {
    public int rob(int[] nums) {
        int gapMax = 0, preMax = 0;
        for(int i =0;i<nums.length;i++){
            int oldGap = gapMax;
            gapMax = Math.max(preMax, gapMax);
            preMax = oldGap + nums[i];
        }
        return Math.max(gapMax, preMax);
    }
}
