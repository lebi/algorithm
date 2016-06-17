package util;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) { val = x; }
	public ListNode(int[] arr){
		this.val=arr[0];
		ListNode tmp=this;
		for(int i=1;i<arr.length;i++){
			ListNode node=new ListNode(arr[i]);
			tmp.next=node;
			tmp=node;
		}
	}
	public void print() {
		ListNode it=this;
		while(it!=null){
			System.out.print(it.val+"->");
			it=it.next;
		}
		System.out.println();
	}
	
}