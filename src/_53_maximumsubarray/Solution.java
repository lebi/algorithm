package _53_maximumsubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
    	int max=0;
    	int[] arr=new int[nums.length];
    	for(int i=0;i<nums.length;i++){
    		if(max<=0)
    			max=0;
    		max+=nums[i];
    		arr[i]=max;
    	}
    	for(int i=0;i<nums.length;i++)
    		max=arr[i]<max?max:arr[i];
    	return max;
    }
}
