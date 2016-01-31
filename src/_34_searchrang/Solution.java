package _34_searchrang;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1,end=-1;
        int i=0,j=nums.length;
        if(j<0){
            int[] ret={start,end};
            return ret;
        }
        while(true){
        	if(i==j)break;
        	int m=(i+j)/2;
        	if(nums[m]==target){
        		int k=m;
        		while(k>=0&&nums[k]==target) k--;
        		start=k+1;
        		k=m;
        		while(k<=nums.length-1&&nums[k]==target) k++;
        		end=k-1;
        		break;
        	}else if(nums[m]>target) j=m;
        	else if(nums[m]<target) i=m+1;
        }
        int[] ret={start,end};
        return ret;
    }
}
