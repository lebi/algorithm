package sametree;

class TreeNode {
   int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
   public boolean isSameTree(TreeNode p, TreeNode q) {
       if(q!=null&&p!=null){
    	   if(!isSameTree(p.left,q.left))
    		   return false;
    	   if(p.val!=q.val)return false;
    	   if(!isSameTree(p.right,q.right))
    		   return false;
       }else if(q==null&p==null)return true;
       else return false;
       return true;
   }
}