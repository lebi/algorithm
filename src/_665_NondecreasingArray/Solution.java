package _665_NondecreasingArray;

/**
 * Created by hzhuangyan1 on 2017/12/27.
 */
public class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                if(count < 1){
                    if( i > 1 && nums[i] < nums[i - 2]){
                        nums[i] = nums[i-1];
                    }
                    count ++;
                }else
                    return false;
            }
        }
        return true;
    }
}
