package removeDuplicate;

public class Solution {
    public int removeDuplicates(int[] nums) {
    	if(nums.length==0)return 0;
        int count=0;
        for(int i=1;i<nums.length;i++){
        	if(nums[i]==nums[i-count-1]){
        		count++;
        	}
        	int temp=nums[i-count];
        	nums[i-count]=nums[i];
        	nums[i]=temp;
        }
        return nums.length-count;
    }
}
