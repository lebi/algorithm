package _2_addtwonumber;

public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode it1=l1;
    	ListNode it2=l2;
        ListNode head=new ListNode(0);
        int flag=0;
    	ListNode it3=head;
        while(it1!=null&&it2!=null){
        	int a=it1.val;
        	int b=it2.val;
            ListNode temp=new ListNode((a+b+flag)%10);
            flag=(a+b+flag)/10;
            it3.next=temp;
            it3=it3.next;
        	it1=it1.next;
        	it2=it2.next;
        }
        while(it1!=null){
            int a=it1.val;
            ListNode temp=new ListNode((a+flag)%10);
            it3.next=temp;
            it3=it3.next;
            flag=(a+flag)/10;
        	it1=it1.next;
        }        
        while(it2!=null){
            int a=it2.val;
            ListNode temp=new ListNode((a+flag)%10);
            it3.next=temp;
            it3=it3.next;
            flag=(a+flag)/10;
        	it2=it2.next;
        }
        if(flag!=0){
            ListNode temp=new ListNode(flag);
            it3.next=temp;
            it3=it3.next;
        }
        return head.next;
    }
    
    public static void main(String[] args){
    	AddTwoNum add=new AddTwoNum();
    	ListNode l1=new ListNode(5);
    	ListNode l2=new ListNode(5);
    	add.addTwoNumbers(l1, l2);
    }
}

 class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}