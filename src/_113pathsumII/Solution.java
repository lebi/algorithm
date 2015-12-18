package _113pathsumII;

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
	int target=0;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        target=sum;
        if(root==null)return res;
        add(root,0,new ArrayList());
        return res;
    }
    
    public void add(TreeNode node,int sum,List<Integer> list){
    	if(node.left==null&&node.right==null)
    		if(sum+node.val==target){
    			List<Integer> newlist=new ArrayList<>(list);
    			newlist.add(node.val);
    			res.add(newlist);
    		}
    	if(node.left!=null){
    		List<Integer> left=new ArrayList<>(list);
    		left.add(node.val);
    		add(node.left,sum+node.val,left);
    	}
    	if(node.right!=null){
    		List<Integer> right=new ArrayList<>(list);
    		right.add(node.val);
    		add(node.right,sum+node.val,right);
    	}
    }
}
