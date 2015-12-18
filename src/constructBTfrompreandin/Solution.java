package constructBTfrompreandin;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}


public class Solution {
	private int pos=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	return build(0,inorder.length-1,preorder,inorder);
    }
    public TreeNode build(int start,int end,int[] preorder,int[] inorder){
    	if(start>end)return null;
    	else if(start==end){
    	    pos++;
    	    return new TreeNode(inorder[start]);
    	}
    	else{
    		int val=preorder[pos];
    		TreeNode root=new TreeNode(val);
    		int prepos=0;
    		for(int i=start;i<=end;i++)
    			if(preorder[pos]==inorder[i]){
    				prepos=i;
    				break;
    			}
    		pos++;
    		root.left=build(start,prepos-1,preorder,inorder);
    		root.right=build(prepos+1,end,preorder,inorder);
    		return root;
    	}
    }
}
