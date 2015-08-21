package swappair;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution {
    public ListNode swapPairs(ListNode head) {
    	int count=0;
    	ListNode temp;
        ListNode it1=head;
        if(head==null)return null; 
        if(head.next==null) return head;
        ListNode it2=head.next;
        while(it1!=null){
        	if(it2==null)break;
        	if(count==0)
        		head=head.next;
        	temp=it2.next;
        	it2.next=it1;
        	it1.next=temp;
        	it1=it1.next;
        	if(it1==null||it1.next==null) break;
        	it2.next.next=it1.next;
        	it2=it1.next;
        	count++;
        }
        return head;
    }
}