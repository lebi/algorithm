package sort;

public class ChooseSort extends Sort{
	
	public ChooseSort(){
		System.out.println("Choose Sort");
	}

	@Override
	public void sort(){
		for(int i=0;i<arr.length;i++){
			int min=arr[i];
			int tmp=i;
			for(int j=i;j<arr.length;j++){
				if(arr[j]<min){
					min=arr[j];
					tmp=j;
				}
			}
			swap(tmp,i);
		}
		print();
	}
	
}
