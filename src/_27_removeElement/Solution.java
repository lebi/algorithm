package _27_removeElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==val)
        		count++;
        	else{
        		int temp=nums[i-count];
        		nums[i-count]=nums[i];
        		nums[i]=temp;
        	}
        }
        return nums.length-count;
    }
}
