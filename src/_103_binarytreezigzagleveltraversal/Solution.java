package _103_binarytreezigzagleveltraversal;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        reversal(root,0);
        return res;
    }
    
    public void reversal(TreeNode node,int level){
    	if(node!=null){
    		reversal(node.left,level+1);
    		if(res.size()<level+1){
    			for(int i=res.size();i<level+1;i++)
	    			res.add(new ArrayList<Integer>());
    		}
    		if(level%2==0)
        		res.get(level).add(node.val);
    		else
				res.get(level).add(0, node.val);
    		reversal(node.right,level+1);
    	}
    }
}
