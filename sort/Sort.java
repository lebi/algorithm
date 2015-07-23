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
		int[] arr1={5,8,6,2,9,10,1,0};
		sort.arr=arr1;
		sort.sort();
		
		sort=new MergeSort();
		int[] arr2={5,8,6,2,9,10,1,0};
		sort.arr=arr2;
		sort.sort();
		
		sort=new BubbleSort();
		int[] arr3={5,8,6,2,9,10,1,0};
		sort.arr=arr3;
		sort.sort();
		
		sort=new ChooseSort();
		int[] arr4={5,8,6,2,9,10,1,0};
		sort.arr=arr4;
		sort.sort();

		sort=new InsertSort();
		int[] arr5={5,8,6,2,9,10,1,0};
		sort.arr=arr5;
		sort.sort();

		sort=new HeapSort();
		int[] arr6={5,8,6,2,9,10,1,0};
		sort.arr=arr6;
		sort.sort();
	}
}
