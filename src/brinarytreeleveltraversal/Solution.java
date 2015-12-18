package brinarytreeleveltraversal;

import java.util.ArrayList;
import java.util.List;
class TreeNode {
	   int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
}

public class Solution {
	List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        reversal(root,0);
        return res;
    }
    
    public void reversal(TreeNode node,int level){
    	if(node!=null){
    		reversal(node.left,level+1);
    		if(res.size()<level+1){
    			for(int i=res.size();i<level+1;i++)
	    			res.add(new ArrayList<Integer>());
    			res.get(level).add(node.val);
    		}else res.get(level).add(node.val);
    		reversal(node.right,level+1);
    	}
    }
}
