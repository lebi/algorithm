package subsetII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	List<List<Integer>> res=new ArrayList();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
        	res.add(new ArrayList());
        	return res;
        }
        	
        List<Integer> arr=new ArrayList();
        List<Integer> count=new ArrayList();
        int i=0;
        int c=1;
        while(true){
        	if(i==nums.length){
        		arr.add(nums[nums.length-1]);
        		count.add(c);
        		break;
        	}
        	if(i>nums.length)break;
        	while(i>=1&&i<nums.length&&nums[i]==nums[i-1]){
        		c++;
        		i++;
        	}
        	if(i>=1&&i<=nums.length){
            	arr.add(nums[i-1]);
            	count.add(c);
        	}
        	i++;
        	c=1;
        }
        print(new ArrayList(),arr,count,0);
        return res;
    }
    public static void main(String [] arg){
    	Solution so=new Solution();
    	so.subsetsWithDup(new int[]{1,1,2});
    }
    
    public void print(List<Integer> taget,List<Integer> arr,List<Integer> count, int i){
    	if(i==arr.size()){
    		res.add(taget);
    		return;
    	}

    	for(int j=0;j<=count.get(i);j++){
    		List<Integer> list=new ArrayList(taget);
    		for(int m=0;m<j;m++)
        		list.add(arr.get(i));
    		print(list,arr,count,i+1);
    	}
    }
}
