package _98_validateBST;

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
	
    public boolean isValidBST(TreeNode root) {
        middlefind(root);
        for(int i=0;i<list.size()-1;i++){
        	if(list.get(i)>=list.get(i+1))return false;
        }
        return true;
    }
    
    public void middlefind(TreeNode node){
    	if(node!=null){
    		middlefind(node.left);
    		list.add(node.val);
    		middlefind(node.right);
    	}
    }
}
