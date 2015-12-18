package _110balancedBT;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public boolean isBalanced(TreeNode root) {
    	if(deep(root)!=-1)return true;
    	return false;
    }
    
    public int deep(TreeNode node){
    	if(node==null)return 1;
    	int left=deep(node.left);
    	int right=deep(node.right);
    	if(left==-1||right==-1)return -1;
    	if(Math.abs(left-right)>1)return -1;
    	return left>right?left+1:right+1;
    }
}