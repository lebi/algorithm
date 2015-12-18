package BSTordertraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class Solution {
	List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	preraversal(root, 0);
    	return res;
    }
    
    public void preraversal(TreeNode node,int deep){
    	if(node!=null){
    		if(res.size()<deep+1)
    			res.add(0,new LinkedList<Integer>());
    		res.get(res.size()-deep-1).add(node.val);
    		preraversal(node.left, deep+1);
    		preraversal(node.right, deep+1);
    	}
    }
}
