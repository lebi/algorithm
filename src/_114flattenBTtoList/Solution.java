package _114flattenBTtoList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    public void flatten(TreeNode root) {
    	if(root==null)return;
        alter(root);
    }
    
    public TreeNode alter(TreeNode node){
    	if(node.left==null)
    		if(node.right==null) return node;
    		else return alter(node.right);
    	else{
    		if(node.right==null){
    			node.right=node.left;
    			node.left=null;
    			return alter(node.right);
    		}
    			
    		else{
    			TreeNode temp=node.right;
    			TreeNode res=alter(node.left);
    			node.right=node.left;
    			node.left=null;
    			res.right=temp;
    			return alter(temp);
    		}
    	}
    }
}
