package _141linkedlistcycle;

 class ListNode {
     int val;
    ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class Solution {
   public boolean hasCycle(ListNode head) {
       ListNode quik=head;
       ListNode slow=head;
       while(slow!=null&&quik!=null){
    	   quik=quik.next;
    	   if(quik==null)
    		   return false;
    	   quik=quik.next;
    	   
    	   slow=slow.next;
    	   if(slow==quik)return true;
       }
       return false;
   }
}