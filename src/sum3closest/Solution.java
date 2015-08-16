package sum3closest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	Arrays.sort(nums);
    	int dis=Integer.MAX_VALUE;
    	int close=0;
    	for(int i=0;i<nums.length-2;i++){
    		int tag=nums[i];
			int h=i+1;
			int e=nums.length-1;
    			while(h<e){
    				if(nums[h]+nums[e]==target-tag){
    					return target;
    				}else if(nums[h]+nums[e]>target-tag){
    					if(nums[h]+nums[e]+tag-target<dis){
    						close=nums[h]+nums[e]+tag;
    						dis=nums[h]+nums[e]+tag-target;
    					}
    						
    						e--;
    				}else if(nums[h]+nums[e]<target-tag){
    					if(-(nums[h]+nums[e]+tag-target)<dis){
    						close=nums[h]+nums[e]+tag;
    						dis=-(nums[h]+nums[e]+tag-target);
    					}
    					h++;
    				}
    			}
    	}
    	return close;
    }
    public static void main(String[] args){
    	Solution so=new Solution();
    	int[] sum={1,1,1,0};
    	System.out.println(so.threeSumClosest(sum, -100));
    }
}
