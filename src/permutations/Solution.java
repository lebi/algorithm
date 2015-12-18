package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> result=new ArrayList();
    	if(nums.length==0)return result;
    	List<Integer> a=new LinkedList();
    	a.add(nums[0]);
    	result.add(a);
    	for(int i=1;i<nums.length;i++){
    		int size=result.size();
        	List<List<Integer>> store=new ArrayList();
    		for(int j=0;j<result.size();j++){
    			for(int n=0;n<=result.get(j).size();n++){
                	List<Integer> list=new LinkedList(result.get(j));
                	list.add(n,nums[i]);
                	store.add(list);
    			}
    		}
    		result=store;
    	}
    	return result;
//    	List<Integer> rest=new LinkedList();
//    	List<Integer> target=new LinkedList();
//    	for(int i=0;i<nums.length;i++)
//    		rest.add(nums[i]);
//    	add(rest,target);
    }
    
//    public void add(List<Integer> rest,List<Integer> target){
//    	if(rest.size()==0){
//    		result.add(target);
//    	}
//    	
//    	for(int i=0;i<rest.size();i++){
//        	List a=new LinkedList();
//        	a.addAll(rest);
//        	List b=new LinkedList();
//        	b.addAll(target);
//    		a.remove(i);
//    		b.add(rest.get(i));
//    		add(a,b);
//    	}
//    }
}
