package rotatelist;
class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x;}
}
     
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    	ListNode it=head;
    	int count=1;
    	if(it==null) return null;
    	while(it.next!=null){
    		it=it.next;
    		count++;
    	}
    	k=k%count;
    	it.next=head;
    	ListNode res=head;
    	for(int i=0;i<count-k-1;i++){
    		res=res.next;
    	}
    	ListNode tmp=res.next;
    	res.next=null;
    	return tmp;
    }
}