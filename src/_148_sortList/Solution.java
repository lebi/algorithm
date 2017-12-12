package _148_sortList;

/**
 * Created by hzhuangyan1 on 2017/12/12.
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode it = head;
        ListNode tail = null;
        if (head == null)
            return head;
        while ((it = it.next) != null){
            tail = it;
        }
        if (tail == null)
            return head;
        sortPart(first, tail);
        return first.next;
    }

    public void sortPart(ListNode head, ListNode tail) {
        ListNode flag = head.next;
        if (flag == null || flag == tail || tail == null){
            return ;
        }

        ListNode it = flag.next;
        ListNode t1 = null;
        ListNode t2 = null;

        while (true){
            ListNode next = it.next;
            if (it.val > flag.val){
                if (it == tail)
                    break;
                if (t2 == null){
                    t2 = tail;
                }
                flag.next = it.next;
                it.next = t2.next;
                t2.next = it;
                t2 = it;
                //add after flag
            }else {
                if (t1 == null)
                    t1 = head;
                flag.next = it.next;
                it.next = t1.next;
                t1.next = it;
                t1 = it;
                //add after head
            }
            //break case tail == it
            if (it == tail){
                break;
            }
            it = next;
        }
        sortPart(flag, t2);
        sortPart(head, t1);
        //sortPart flag tail
        //sortPart head, node before flag
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}