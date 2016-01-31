package _83_removeduplicatefromsortlist;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Solution {
   public ListNode deleteDuplicates(ListNode head) {
       ListNode it=head;
       if(it==null)return head;
       while(it!=null){
       	while(it.next!=null&&it.val==it.next.val){
       		it.next=it.next.next;
       	}
       	it=it.next;
       }
       return head;
   }
   
}