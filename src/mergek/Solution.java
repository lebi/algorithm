package mergek;
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
//    	ListNode head=new ListNode(0);
//    	ListNode it=head;
//        while(true){
//        	boolean check=false;
//        	for(int i=0;i<lists.length;i++){
//        		if(lists[i]!=null) {
//        			check=true;
//        			break;
//        		}
//        	}
//        	if(!check) break;
//        	int min=Integer.MAX_VALUE;
//        	int store=0;
//        	for(int i=0;i<lists.length;i++){
//        		if(lists[i]!=null){
//        			if(lists[i].val<min) {
//        				min=lists[i].val;
//        				store=i;
//        			}
//        		}
//        	}
//        	lists[store]=lists[store].next;
//        	it.next=new ListNode(min);
//        	it=it.next;
//        }
//        return head.next;
    	return merge(lists,0,lists.length-1);
    }
    
    public ListNode merge(ListNode[] lists,int a,int b){
    	if(lists.length==0) return null;
    	if(a<b){
    		int mid=(a+b)/2;
    		ListNode l1=merge(lists,a,mid);
    		ListNode l2=merge(lists,mid+1,b);
    		return mergerTwo(l1,l2);
    	}else 
    		return lists[a];
    }
    
    public ListNode mergerTwo(ListNode l1,ListNode l2){
    	ListNode head=new ListNode(0);
    	ListNode it=head;
    	while(l1!=null&&l2!=null){
    		int min;
    		if(l1.val>l2.val){
    			min=l2.val;
    			l2=l2.next;
    		}else{
    			min=l1.val;
    			l1=l1.next;
    		}
    		it.next=new ListNode(min);
    		it=it.next;
    	}
    	while(l1!=null){
    		it.next=new ListNode(l1.val);
    		l1=l1.next;
    		it=it.next;
    	}

    	while(l2!=null){
    		it.next=new ListNode(l2.val);
    		l2=l2.next;
    		it=it.next;
    	}
    	return head.next;
    }
    
    public static void main(String[] ar){
    	Solution so=new Solution();
    	ListNode a=new ListNode(1);
    	ListNode b=new ListNode(0);
    	ListNode[] list={a,b};
    	System.out.println(so.mergeKLists(list).val);
    }

}