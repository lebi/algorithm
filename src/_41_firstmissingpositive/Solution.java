package _41_firstmissingpositive;

import java.util.Arrays;

public class Solution {
    public int firstMissingPositive(int[] nums) {
    	int temp=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]<=0)continue;
        	if(nums[i]-1>=nums.length) {
        		nums[i]=-1;
        		continue;
        	}
        	temp=nums[i];
        	swap(nums,i,nums[i]-1);
        	if(temp!=nums[i]) i--;
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
        	if(nums[i]!=i+1)return i+1;
        }
        return nums.length+1;
    }
    public void swap(int nums[],int a,int b){
    	int temp=nums[a];
    	nums[a]=nums[b];
    	nums[b]=temp;
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	int[] arr={-4,24,32,25,16,-8,3,-5,-6,30,3,3,29,-5,6,-3,1,29,-2,4,4,7,14,20,5,0,25,2,13,26,-9,7,6,33};
    	System.out.println(so.firstMissingPositive(arr));
    }
}
