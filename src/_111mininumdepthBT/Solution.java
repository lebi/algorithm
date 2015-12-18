package _111mininumdepthBT;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public int minDepth(TreeNode root) {
    	if(root==null)return 0;
    	return deep(root,1);
    }
    
    public int deep(TreeNode root,int deep){
    	if(root.left==null&&root.right==null)return deep;
    	int left=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
    	if(root.left!=null)
    		left=deep(root.left,deep+1);
    	if(root.right!=null)
    		right=deep(root.right,deep+1);
    	return left>right?right:left;
    }
}
