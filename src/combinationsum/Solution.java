package combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {
	private List<List<Integer>> res=new ArrayList();
	
	public void dfs(int[] candidates,List<Integer> before,int target){
		if(target<0)
			return;
		if(target==0) {
			System.out.println(before);
			res.add(before);
			return;
		}
    	for(int i=0;i<candidates.length;i++){
    		if(candidates[i]>=before.get(before.size()-1)){
        		List temp=new ArrayList();
        		temp.addAll(before);
        		temp.add(candidates[i]);
        		dfs(candidates,temp,target-candidates[i]);	
    		}
    	}
	}
	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	for(int i=0;i<candidates.length;i++){
    		List<Integer> before=new ArrayList<Integer>();
    		before.add(candidates[i]);
    		dfs(candidates,before,target-candidates[i]);
    	}
    	return res;
//    	Arrays.sort(candidates);
//    	List<List<Integer>> res=new ArrayList();
//        List<List<Integer>> store=new ArrayList();
//        for(int i=0;i<candidates.length;i++){
//    		List<Integer> t=new ArrayList();
//    		t.add(candidates[i]);
//        	if(candidates[i]<target){
//        		store.add(t);
//        	}else if(candidates[i]==target){
//        		res.add(t);
//        	}
//        }
//        boolean check=true;
//        int high=0;
//        
//        while(check){
//            int size=store.size();
//            check=false;
//            List<List<Integer>> restore=new ArrayList();
//            for(int i=0;i<size;i++){
//            	for(int n=0;n<candidates.length;n++){
//            		if(candidates[n]<store.get(i).get(high)) continue;
//            		int sum=candidates[n];
//                	for(int j=0;j<store.get(i).size();j++){
//                		sum+=store.get(i).get(j);
//                	}
//            		List temp=new ArrayList();
//            		temp.addAll(store.get(i));
//            		temp.add(candidates[n]);
//                	if(sum<target){
//                		restore.add(temp);
//                		check=true;
//                	}else if(sum==target)
//                		res.add(temp);
//            	}
//            }
//            store=restore;
//            high++;
//        }
//        return res;
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	int[] can={2,3,6,7};
    	System.out.println(so.combinationSum(can, 7).size());
    }
}
