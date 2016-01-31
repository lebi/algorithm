package _19_removeend;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode node=head;
    	ListNode before=head;
        for(int i=0;i<n;i++)
        	node=node.next;
        if(node==null)return head.next;
        while(node.next!=null){
        	before=before.next;
        	node=node.next;
        }
        before.next=before.next.next;
        return head;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}