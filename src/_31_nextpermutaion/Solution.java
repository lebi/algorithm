package _31_nextpermutaion;

import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
    	int i=nums.length-1;
    	while(i>1){
    		if(nums[i-1]<nums[i])
    			break;
    		i--;
    	}
    	int re=0;
    	if(i<1||(i==1&&nums[0]>nums[1])){
    		re=-1;
    	}else{
    		for(int j=nums.length-1;j>=i;j--){
    			if(nums[j]>nums[i-1]){
    				swap(nums,i-1,j);
    				re=i-1;
    				break;
    			}
    		}
    	}
    	int k=1;
    	while(true){
    		if(re+k>=nums.length-k) break;
    		swap(nums,re+k,nums.length-k);
    		k++;
    	}
    }
    public void swap(int[] arr,int a,int b){
    	int ex=arr[a];
    	arr[a]=arr[b];
    	arr[b]=ex;
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	int[] arr={4};
    	so.nextPermutation(arr);
    }
}