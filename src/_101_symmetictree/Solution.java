package _101_symmetictree;

class TreeNode {
	   int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
}
public class Solution {
    public boolean isSymmetric(TreeNode root) {
    	if(root==null)return true;
    	return compare(root.left,root.right);
    }
    public boolean compare(TreeNode a,TreeNode b){
    	if(a==null&&b==null)return true;
    	
    	if(a!=null&&b!=null&&a.val==b.val){
    		if(compare(a.left,b.right)&&compare(a.right,b.left))
    			return true;
    	}
    	return false;
    }
}
