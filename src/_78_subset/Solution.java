package _78_subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        int[] brinary=new int[nums.length];
        int len=(1<<nums.length);
        List<List<Integer>> res=new ArrayList();
        
        for(int i=0;i<len;i++){
    		List<Integer> list=new ArrayList();
        	for(int j=0;j<nums.length;j++){
        		if(brinary[j]==1)
        			list.add(nums[j]);
        	}
        	res.add(list);
        	add(brinary);
        }
        return res;
    }
    void add(int[] arr){
    	int flag=1;
    	for(int i=arr.length-1;i>=0;i--){
    		arr[i]=flag+arr[i];
    		if(arr[i]>1){
    			flag=1;
    			arr[i]=arr[i]%2;
    		}else flag=0;
    		if(flag==0)return;
    	}
    }
}
