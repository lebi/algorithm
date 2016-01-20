package _144brinarytreepreorder;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
	List<Integer> list=new ArrayList<>();
   public List<Integer> preorderTraversal(TreeNode root) {
	   if(root==null)return list;
	   list.add(root.val);
	   preorderTraversal(root.left);
	   preorderTraversal(root.right);
	   return list;
   }
}