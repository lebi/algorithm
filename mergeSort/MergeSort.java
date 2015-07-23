package mergeSort;

public class MergeSort {
	public int[] arr;
	
	public void sort(int b,int e){
		if(b<e){
			int m=(b+e)/2;
			sort(b,m);
			sort(m+1,e);
			merge(b,m,e);
		}
	}
	
	public void merge(int b,int m,int e){
		int a1=b;
		int a2=m+1;
		int[] temp=new int[e-b+1];
		int tc=0;
		while(a1<=m&&a2<=e){
			if(arr[a1]<arr[a2])
				temp[tc++]=arr[a1++];
			else
				temp[tc++]=arr[a2++];
		}
		
		while(a1<=m)
			temp[tc++]=arr[a1++];

		while(a2<=e)
			temp[tc++]=arr[a2++];
		
		for(int i=0;i<e-b+1;i++){
			arr[b+i]=temp[i];
		}
	}
	
	public static void main(String[] args){
		MergeSort ms=new MergeSort();
		int[] arr = {8,6,1,3,7,10,2};
		ms.arr=arr;
		ms.sort(0, arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
