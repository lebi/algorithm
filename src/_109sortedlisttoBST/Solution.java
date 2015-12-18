package _109sortedlisttoBST;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
	List<Integer> list=new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
    	ListNode n=head;
        while(n!=null){
        	list.add(n.val);
        	n=n.next;
        }
        return build(0,list.size()-1);
    }
    public TreeNode build(int start,int end){
    	if(start>end)return null;
    	int mid=(start+end)/2;
    	TreeNode root=new TreeNode(list.get(mid));
    	root.left=build(start,mid-1);
    	root.right=build(mid+1,end);
    	return root;
    }
}
