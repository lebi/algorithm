package _124_binarytreemaxpath;

  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
public class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        middle(root);
        return max;
    }
    
    public int middle(TreeNode node){
        if(node!=null){
            int left=middle(node.left);
            int right=middle(node.right);
            if(left>0&&right>0)
                max=Math.max(max,left+right+node.val);
            else if(left>0)
                max=Math.max(max,left+node.val);
            else if(right>0)
                max=Math.max(max,right+node.val);
            else
                max=Math.max(max,node.val);
            int ret=Math.max(left+node.val,right+node.val);
            if(ret>0)return ret;
        }
        return 0;
    }
}