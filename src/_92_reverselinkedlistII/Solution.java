package _92_reverselinkedlistII;

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode first=new ListNode(0);
        first.next=head;
        ListNode start=first;
        ListNode it=head;
        for(int i=1;i<m;i++){
        	start=start.next;
        	it=it.next;
        }
        ListNode before=start;
        ListNode end=it.next;
        for(int i=m;i<n;i++){
        	ListNode temp=it.next;
        	it.next=before;
        	before=it;
        	it=temp;
        	end=it.next;
        }
        start.next.next=end;
        start.next=it;
        return first.next;
    }
}