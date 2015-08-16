package sort;

public class InsertSort extends Sort{
	public InsertSort(){
		System.out.println("Insert Sort");
	}

	@Override
	public void sort() {
		for(int i=0;i<arr.length-1;i++){
			int comp=arr[i+1];
			for(int j=i;j>=0;j--){
				if(comp<arr[j])
					swap(j,j+1);
				else
					break;
			}
		}
		print();
	}

}
