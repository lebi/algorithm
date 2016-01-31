package _145_brinarytreepostorder;

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
  public List<Integer> postorderTraversal(TreeNode root) {
	   if(root==null)return list;
	   postorderTraversal(root.left);
	   postorderTraversal(root.right);
	   list.add(root.val);
	   return list;
  }
}