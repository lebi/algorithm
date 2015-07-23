package quickSort;
public class quickSort {
	public int[] arr;
	
	public void sort(int b,int e){
		if(b<e){
			int end=partition(b,e);
			sort(b,end-1);
			sort(end+1,e);
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
	
	public void swap(int a,int b){
		int t=arr[a];
		arr[a]=arr[b];
		arr[b]=t;
	}
	
	public static void main(String[] args){
		int[] arr={4,9,8,3,6,7,10,1};
		quickSort qs=new quickSort();
		qs.arr=arr;
		qs.sort(0, arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
