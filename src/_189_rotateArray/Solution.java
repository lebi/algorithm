package _189_rotateArray;

/**
 * Created by hzhuangyan1 on 2017/12/12.
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[k];
        System.arraycopy(nums, nums.length - k,arr, 0, k);
        System.arraycopy(nums, k, nums, 0, nums.length - k);
        System.arraycopy(nums, 0, arr, 0, k);
    }
}
