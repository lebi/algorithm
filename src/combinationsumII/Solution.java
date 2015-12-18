package combinationsumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	private List<List<Integer>> res=new ArrayList();
	
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
    	Arrays.sort(candidates);
		int count=0;
    	for(int i=0;i<candidates.length-1;i++){
    		if(candidates[i]==candidates[i+1]){
    			count++;
    			continue;
    		}
    		List<Integer> before=new ArrayList();
    		before.add(candidates[i]);
    		dfs(candidates,i-count,count,before,target-candidates[i]);
    		count=0;
    	}
    	
		List<Integer> before=new ArrayList();
		before.add(candidates[candidates.length-1]);
		dfs(candidates,candidates.length-1-count,count,before,target-candidates[candidates.length-1]);
		
		return res;
    }
    
    public void dfs(int[] candidates,int index,int count,List<Integer> before,int target){
		if(target<0)
			return;
		if(target==0) {
			res.add(before);
			return;
		}
		int thiscount=0;
		int i=index+1;
		for(;i<candidates.length-1;i++){
    		if(candidates[i]==candidates[i+1]){
    			thiscount++;
    			continue;
    		}

    		List<Integer> newbefore=new ArrayList();
    		newbefore.addAll(before);
    		newbefore.add(candidates[i]);
    		dfs(candidates,i-thiscount,thiscount,newbefore,target-candidates[i]);
    		thiscount=0;
		}
		if(i<candidates.length){
			List<Integer> newbefore=new ArrayList();
			newbefore.addAll(before);
			newbefore.add(candidates[candidates.length-1]);
			dfs(candidates,candidates.length-1-thiscount,thiscount,newbefore,target-candidates[candidates.length-1]);
		}
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	int[] can={1};
    	System.out.println(so.combinationSum2(can, 2).size());
    }    
}
