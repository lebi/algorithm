package sort;

public class MergeSort extends Sort{
	public MergeSort(){
		System.out.println("Merge Sort");
	}
	
	public void mergesort(int b,int e){
		if(b<e){
			int m=(b+e)/2;
			mergesort(b,m);
			mergesort(m+1,e);
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
	
	@Override
	public void sort() {
		mergesort(0, arr.length-1);
		print();
	}
}
