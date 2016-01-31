package _106_constructBTfromposandin;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class Solution {
	private int pos=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pos=inorder.length-1;
        return build(0,inorder.length-1,inorder,postorder);
    }
    
    public TreeNode build(int start,int end,int[] inorder,int[] postorder){
    	if(start>end)return null;
    	else if(start==end){
    		pos--;
    		return new TreeNode(inorder[start]);
    	}else{
    		int val=postorder[pos];
    		TreeNode root=new TreeNode(val);
    		int inpos=0;
    		for(int i=start;i<=end;i++){
    			if(inorder[i]==postorder[pos]){
    				inpos=i;
    				break;
    			}
    		}
    		pos--;
    		root.right=build(inpos+1,end,inorder,postorder);
    		root.left=build(start,inpos-1,inorder,postorder);
    		return root;
    	}
    }
}
