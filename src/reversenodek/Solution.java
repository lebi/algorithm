package reversenodek;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ex,before=head,after=head,store,temp;
        if(k==1)return head;

        head=before;
        temp=before;
        ex=after;
        while(before!=null){
        	store=before;        
        	for(int i=1;i<k;i++){
        		if(before==null||before.next==null) return head;
        		else before=before.next;
        	}
        	before=store;
        	for(int i=1;i<k;i++){
        		before=before.next;
        		temp.next=ex;
        		ex=temp;
        		temp=before;
        	}
        	after.next=store;
        	if(before!=null){
        		after.next=before;
        		after=store;
        	}
        }
        return head;
    }
}