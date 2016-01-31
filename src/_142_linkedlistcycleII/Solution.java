package _142_linkedlistcycleII;


class ListNode {
    int val;
   ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
    	ListNode quik=head;
    	ListNode slow=head;
    	while(quik!=null&&slow!=null){
    		quik=quik.next;
    		if(quik==null) return null;
    		quik=quik.next;
    		slow=slow.next;
    		if(slow==quik){
    			ListNode last=head;
    			while(true){
    				if(last==slow)return last;
    				last=last.next;
    				slow=slow.next;
    			}
    		}
    	}
    	return null;
    }
}
