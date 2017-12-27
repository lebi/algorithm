package _203_RemoveLinkedListElements;

import util.ListNode;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode it = head;
        ListNode prev = null;
        while(it != null){
            if(it.val == val){
                if(prev == null){
                    head = it.next;
                }else {
                    prev.next = it.next;
                }
            }else{
                prev = it;
            }
            it = it.next;
        }
        return head;
    }
}
