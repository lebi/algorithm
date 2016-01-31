package _116_populatingnextrightprinter;

 class TreeLinkNode {
     int val;
     TreeLinkNode left, right, next;
     TreeLinkNode(int x) { val = x; }
 }

public class Solution {
   public void connect(TreeLinkNode root) {
       TreeLinkNode head=root;
       while(head!=null){
           TreeLinkNode it=head;
           while(it!=null&&it.left!=null){
               it.left.next=it.right;
               TreeLinkNode temp=it.right;
               it=it.next;
               if(it!=null)
                   temp.next=it.left;
           }
           head=head.left;
       }
   }
}