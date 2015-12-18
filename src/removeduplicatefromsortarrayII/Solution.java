package removeduplicatefromsortarrayII;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
    	int count=0;
        for(int i=0;i<nums.length;i++){
        	if(i>=2){
        		swap(nums,i,i-count);
        		if(nums[i-count]==nums[i-count-2])
        			count++;
        	}
        }
        return nums.length-count;
    }
    
    void swap(int[] arr,int i,int j){
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.removeDuplicates(new int[] {1,1,1,2}));
    }
}
