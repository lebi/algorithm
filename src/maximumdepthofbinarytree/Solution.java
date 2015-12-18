package maximumdepthofbinarytree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class Solution {
	int max=0;
    public int maxDepth(TreeNode root) {
        middle(root,1);
        return max;
    }
    public void middle(TreeNode node,int deep){
    	if(node!=null){
    		middle(node.left,deep+1);
    		max=deep>max?deep:max;
    		middle(node.right,deep+1);
    	}
    }
}
