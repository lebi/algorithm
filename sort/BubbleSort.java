package sort;

public class BubbleSort extends Sort{
	public BubbleSort(){
		System.out.println("Bubble Sort");
	}
	
	@Override
	public void sort() {
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(j<arr.length-1){
					if(arr[j]>arr[j+1])swap(j,j+1);
				}
			}
		}
		print();
	}
}
