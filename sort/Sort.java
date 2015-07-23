package sort;

public abstract class Sort {
	public int[] arr;
	public abstract void sort();
	public void swap(int a,int b){
		int t=arr[a];
		arr[a]=arr[b];
		arr[b]=t;	
	}
	
	public void print(){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ; ");
		System.out.println();
	}
	
	public static void main(String[] args){
		Sort sort=new quickSort();
		int[] arr={5,8,6,2,9,10,1,0};
		sort.arr=arr;
		sort.sort();
		

		sort=new MergeSort();
		sort.arr=arr;
		sort.sort();
	}
}
