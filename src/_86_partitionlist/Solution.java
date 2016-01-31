package _86_partitionlist;
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class Solution {

    public ListNode partition(ListNode head, int x) {
    	ListNode before=new ListNode(0);
    	ListNode res=before;
    	before.next=head;
    	ListNode bigstart=head;
        while(bigstart!=null&&bigstart.val<x){
        	bigstart=bigstart.next;
        	before=before.next;
        }
        if(bigstart==null)return head;
        ListNode it=bigstart.next;
        while(it!=null){
        	if(it.val<x){
        		ListNode tmp=before.next;
        		bigstart.next=it.next;
        		before.next=it;
        		it.next=tmp;
        		before=before.next;
            	it=bigstart.next;
        	}else{
        		it=it.next;
        		bigstart=bigstart.next;
        	}
        }
        return res.next;
    }
}