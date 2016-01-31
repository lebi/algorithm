package _18_sum4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	Arrays.sort(nums);
    	int a=0;
		List res=new ArrayList();
		if(nums.length<4) return res;
		while(a<nums.length-3){
			if(a>=1&&nums[a]==nums[a-1]){
				a++;continue;
			}
			int ab=a+1;
			while(ab<nums.length-2){
				if(ab>a+1&&nums[ab]==nums[ab-1]){
					ab++;continue;
				}
	    		int b=ab+1;
	    		int c=nums.length-1;
	    		boolean first=true;
	    		while(b<c){
	    			if(nums[a]+nums[b]+nums[c]+nums[ab]==target){
	    				if(first){
	    					List<Integer> tmp=new ArrayList();
	    					tmp.add(nums[a]);tmp.add(nums[ab]);tmp.add(nums[b]);tmp.add(nums[c]);
	    					res.add(tmp);
	    					first=false;
	    				}
	    				b++;
	    			}else if(nums[a]+nums[b]+nums[c]+nums[ab]>target){
	    				first=true;c--;
	    			}else if(nums[a]+nums[b]+nums[c]+nums[ab]<target){
	    				first=true;b++;
	    			}
	    		}
				ab++;
			}
			a++;
		}
    	return res;
//		List<List<Integer>> res=new ArrayList();
//    	Arrays.sort(nums);
//    	Map<Integer,List> map=new HashMap();
//    	for(int i=0;i<nums.length;i++){
//    		for(int j=i+1;j<nums.length;j++){
//    			int sum=nums[i]+nums[j];
//    			List t=new ArrayList();
//    			t.add(nums[i]);t.add(nums[j]);
//    			if(map.containsKey(sum)){
//    				map.get(sum).add(t);
//    			}else {
//    				List a=new ArrayList();
//    				a.add(t);
//    				map.put(sum, a);
//    			}
//    		}
//    	}
//    	Set<Integer> set=map.keySet();
//    	Iterator<Integer> it=set.iterator();
//    	while(it.hasNext()){
//    		int k=it.next();
//    		int sub=target-k;
//    		if(map.containsKey(sub)){
//    			List keyList=map.get(k);
//    			List subList=map.get(sub);
//    			for(int i=0;i<keyList.size();i++)
//    				for(int j=0;j<keyList.size();j++){
//    					System.out.println(keyList.get(i));
//    					res.add((List)keyList.get(i));
//    					res.get(res.size()-1).addAll((List)subList.get(j));
//    				}
//    		}
//    	}
//    	return res;
    }
    
    public static void main(String[] ar){
    	Solution so=new Solution();
    	int[] sum={-1,-5,-5,-3,2,5,0,4};
    	System.out.println(so.fourSum(sum,-7));

    }
}
