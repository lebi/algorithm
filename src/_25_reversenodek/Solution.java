package _25_reversenodek;

import util.ListNode;


public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if(k==1||head==null)return head;
        ListNode start=head,end=head,next,it,itnext,itprev;
        it=head;
        for(int i=0;i<k-1;i++){
        	it=it.next;
        	if(it==null)return head;
        }
        head=it;
        end=head;
        while(true){
        	itprev=start;
			it=start.next;
			next=end.next;
    		for(int i=0;i<k-1;i++){
    			itnext=it.next;
    			it.next=itprev;
    			itprev=it;
    			it=itnext;
    		}
        	end=next;
        	for(int i=0;i<k-1;i++){
        		if(end==null||end.next==null) {
        			start.next=next;
        			return head;
        		}
        		end=end.next;
        	}
    		start.next=end;
    		start=next;
        }
    }
    
    public static void main(String[] args){
    	Solution so=new Solution();
    	so.reverseKGroup(new ListNode(new int[]{1,2,4}), 2).print();
    }
}