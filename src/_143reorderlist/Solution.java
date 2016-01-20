package _143reorderlist;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Solution {
    public void reorderList(ListNode head) {
    	int len=0;
    	ListNode l1=head;
    	while(l1!=null){
    		len++;
    		l1=l1.next;
    	}
    	int mid=len/2;
    	l1=head;
    	
    	if(l1==null)return;
    	
    	for(int i=0;i<mid;i++)
    		l1=l1.next;
    	ListNode l2=l1.next;
    	l1.next=null;
    	
    	if(l2==null)return;
		ListNode prev=l2;
		l2=prev.next;
		prev.next=null;
		
    	while(l2!=null){
    		ListNode tmp=l2.next;
    		l2.next=prev;
    		prev=l2;
    		l2=tmp;
    	}
    	l1=head;
    	l2=prev;
    	
    	
    	while(l2!=null){
    		ListNode i1=l1.next;
    		ListNode i2=l2.next;
    		l1.next=l2;
    		l2.next=i1;
    		l1=i1;
    		l2=i2;
    	}
    }
}
