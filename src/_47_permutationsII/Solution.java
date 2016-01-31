package _47_permutationsII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    	List<List<Integer>> result=new ArrayList();
    	List f=new ArrayList();
    	f.add(nums[0]);
    	result.add(f);
    	
		for(int j=1;j<nums.length;j++){
    		List<List<Integer>> store=new ArrayList();
        	for(List<Integer> list : result){
				for(int i=0;i<=list.size();i++){
					if(i<list.size()&&list.get(i)==nums[j])continue;
					List temp=new LinkedList(list);
					temp.add(i, nums[j]);
					store.add(temp);
//					System.out.println(list);
					System.out.println(temp);
    			}
    		}
			result=store;
    	}
		return result;
    }
    
    public static void main(String[] arg){
    	int[] arr={3,3,0,0,2,3,2};
    	Solution so=new Solution();
    	System.out.println(so.permuteUnique(arr).size());
    }
}
