package _206_ReverseLinkedList;

import util.ListNode;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode it = head, prev = null;
        while(it != null){
            ListNode tmp = it.next;
            it.next = prev;
            prev = it;
            it = tmp;
        }
        return prev;
    }
}
