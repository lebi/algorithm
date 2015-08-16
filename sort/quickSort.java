package sort;
public class quickSort extends Sort{
	public quickSort(){
		System.out.println("Quick Sort");
	}
	
	public void quicksort(int b,int e){
		if(b<e){
			int end=partition(b,e);
			quicksort(b,end-1);
			quicksort(end+1,e);
		}
	}
	
	public int partition(int b,int e){
		int index=b;
		int mid=arr[e];
		for(int i=b;i<e;i++){
			if(arr[i]<mid){
				swap(index,i);
				index++;
			}
		}
		swap(index,e);
		return index;
	}

	@Override
	public void sort() {
		quicksort(0, arr.length-1);
		print();
	}
}
