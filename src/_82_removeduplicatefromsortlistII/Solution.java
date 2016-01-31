package _82_removeduplicatefromsortlistII;
class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode it=head;
        if(it==null||it.next==null)return head;
        ListNode before=new ListNode(0);
        ListNode res=before;
        before.next=head;
        boolean same=false;
        while(it!=null){
        	while(it.next!=null&&it.val==it.next.val){
        		same=true;
        		it.next=it.next.next;
        	}
        	if(same){
        		before.next=it.next;
        	}else{
        		before=before.next;
        	}
        	same=false;
    		it=it.next;
        }
        return res.next;
    }
}
