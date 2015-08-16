package heap;

public class Heap {
	private int[] heap;
	public int length=0;
	public Heap(){
		heap=new int[1];
	}
	
	public void push(int val){
		if(length==heap.length){
			int[] temp=new int[length*2];
			for(int i=0;i<length;i++){
				temp[i]=heap[i];
			}
			heap=temp;
		}
		heap[length]=val;
		for(int i=length;i>0;i=(i-1)/2){
			int p=(i-1)/2;
			if(p<0)
				break;
			if(heap[p]>heap[i])
				exchange(p,i);
		}
		length++;
	}
	
	public int pop(){
		int re=heap[0];
		length--;
		heap[0]=heap[length];
		heap[length]=0;
		
		for(int i=0;i<length;){
			int l=i*2+1;
			int r=l+1;
			if(r>=length||l>=length)
				break;
			if(heap[r]<heap[l])
				l=r;
			if(heap[l]<heap[i]){
				exchange(l,i);
				i=l;
				continue;
			}
			break;
		}
//			c=c+1;
//			if(c<length&&heap[c]<heap[i]){
//				exchange(c,i);
//				i=c;
//				continue;
//			}
//			break;
//		}
		return re;
	}
	
	private void exchange(int a,int b){
		int temp=heap[a];
		heap[a]=heap[b];
		heap[b]=temp;
	}
	
	public void print(){
		for(int i=0;i<length;i++)
			System.out.println(heap[i]);
	}
	
	public static void main(String[] args){
		Heap min=new Heap();
		min.push(10);
		min.push(4);
		min.push(9);
		min.push(6);
		min.push(2);
		min.push(5);
		for(int i=0;i<6;i++){
			System.out.println(min.pop());
		}
	}
}
//
//class Node{
//	public Node right;
//	public Node left;
//	public int value;
//}