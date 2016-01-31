package _33_searchrotate;

public class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1,min;
        if(nums.length==0) return -1;
        while(true){
        	if(i==j)break;
        	int m=(i+j)/2;
        	System.out.println(m);
        	if(nums[m]<nums[j]){
        		if(m==0||nums[m-1]>nums[m]){
        			i=m;
        			break;
        		}else j=m;
        	}else i=m+1;
        }
        min=i;
    	System.out.println(min);
        i=0;
        j=nums.length;
        while(true){
        	if(i==j)break;
        	int m=(i+j)/2;
        	if(nums[(m+min)%nums.length]==target){
        		return (m+min)%nums.length;
        	}else if(nums[(m+min)%nums.length]>target) j=m;
        	else i=m+1;
        }
        return -1;
    }
    
    public static void main(String[] a){
    	Solution so=new Solution();
    	int[] nums={};
    	System.out.println(so.search(nums, 2));
    }
}
