package _112pathsum;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
	int target=0;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;
        target=sum;
        if(check(root,0))return true;
        return false;
    }
    public boolean check(TreeNode node,int sum){
    	if(node.left==null&&node.right==null)
    		if(sum+node.val==target)return true;
    		else return false;
    	if(node.left!=null)
    		if(check(node.left,sum+node.val))return true;
    	if(node.right!=null)
    		if(check(node.right,sum+node.val))return true;
    	return false;
    }
}
