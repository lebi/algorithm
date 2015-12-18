package recoverBSt;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
	boolean flag=true;
	int a=0,b=0;
	int pos_a=0,pos_b=0,count=0;
	int prev=Integer.MIN_VALUE;
    public void recoverTree(TreeNode root) {
    	middle(root);
    	count=0;
    	recover(root);
    }
    
    public void middle(TreeNode node){
    	if(node!=null){
    		middle(node.left);
    		count++;	
    		if(node.val>prev)
    			prev=node.val;
    		else{
    			if(flag){
    				a=prev;
    				b=node.val;
    				pos_a=count-1;
    				pos_b=count;
    				flag=false;
    			}else{
    				b=node.val;
    				pos_b=count;
    			}
    		}
    		middle(node.right);
    	}
    }
    
    public void recover(TreeNode node){
    	if(node!=null){
    		recover(node.left);
    		count++;
    		if(count==pos_a){
    		    node.val=b;
    		}
    		if(count==pos_b){
    		    node.val=a;
    		}
    		recover(node.right);
    	}
    }

}