package sort;

public class HeapSort extends Sort{
	public HeapSort(){
		System.out.println("Heap Sort");
	}
	int[] heap;
	int length=0;
	
	@Override
	public void sort() {
		heap=new int[arr.length];
		for(int i=0;i<arr.length;i++)
			push(arr[i]);
		print();
	}
	
	private void push(int a){
		heap[length]=a;
		for(int i=length;i>0;i=(i-1)/2){
			int par=(i-1)/2;
			if(a<heap[par])
				swap(i,par);
		}
		length++;
	}
	
	private int pop(){
		int ret=heap[0];
		length--;
		heap[0]=heap[length];
		for(int i=0;i<length;){
			int left=2*i+1;
			int right=2*i+2;
			if(left>length)
				break;
			if(right>length){
				if(heap[i]>heap[left])
					swap(i,left);
				i=left;
				continue;
			}
			if(heap[left]>heap[right])
				left=right;
			if(heap[i]>heap[left])
				swap(i,left);
			i=left;
		}
		return ret;
	}
	
	public void print(){
		for(int i=0;i<heap.length;i++){
			System.out.print(pop()+" ; ");
		}
		System.out.println();
	}
	
	public void swap(int a,int b){
		int t=heap[a];
		heap[a]=heap[b];
		heap[b]=t;	
	}
}
