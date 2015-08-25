package insertpos;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length;
        while(true){
        	if(i==j)break;
        	int m=(i+j)/2;
        	if(nums[m]==target)return m;
        	else if(nums[m]<target) i=m+1;
        	else j=m;
        }
        if(i==0) return 0;
        else if(i==nums.length-1&&nums[i]<target) return nums.length;
        return i;
    }
    
}
