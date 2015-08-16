package sum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
    	List res=new ArrayList();
    	int before;
    	for(int i=0;i<nums.length-2;i++){
    		if(i>0&&nums[i]==nums[i-1])continue;
    		int tag=nums[i];
			int h=i+1;
			int e=nums.length-1;
    			boolean first=true;
    			while(h<e){
    				if(nums[h]+nums[e]==-tag){
    					if(first){
	    					List temp=new ArrayList();
	    					temp.add(tag);
	    					temp.add(nums[h]);
	    					temp.add(nums[e]);
	    					res.add(temp);
	    					first=false;
    					}
    					h++;
    				}else if(nums[h]+nums[e]>-tag){
    					e--;first=true;
    				}else if(nums[h]+nums[e]<-tag){
    					h++;first=true;
    				}
    			}
    	}
    	return res;
    }
    
    public static void main(String[] args){
    	Solution so=new Solution();
    	int[] sum={-1,-12,14,-6,4,-11,2,-7,13,-15,-1,11,-15,-15,13,-9,-11,-10,-7,-13,7,9,-13,-3,10,1,-5,12,11,-9,2,-4,-6,-7,5,5,-2,14,13,-12,14,-3,14,14,-11,5,12,-6,10,-9,-4,-6,-15,-9,-1,2,-1,9,-9,-5,-15,8,-2,-6,9,10,7,14,9,5,-13,9,-12,8,8,-8,-2,-2,1,-15,-4,5,-13,-4,3,1,5,-13,-13,11,-11,10,5,3,11,-9,-2,3,-10,-7,-6,14,9,-11,7,2,-4,13,7,5,13,-12,-13,7,-9,5,-7,11,-1,-12,8,3,13,-10,13,1,-4};
    	System.out.println(so.threeSum(sum));
    }

}
