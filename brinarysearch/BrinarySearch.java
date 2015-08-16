package brinarysearch;

public class BrinarySearch {
	public int[] arr;
	public int search(int a){
		int begin=0;
		int end=arr.length-1;
		while(true){
			if(begin==end)
				return -1;
			int m=(begin+end)/2;
			if(arr[m]<a){
				begin=m+1;
			}else if(arr[m]>a){
				end=m;
			}else return m;
		}
	}
	
	public static void main(String[] args){
		BrinarySearch bs=new BrinarySearch();
		int[] arr={2,6,9,10,15,23,30,36,38,40,50};
		bs.arr=arr;
		System.out.println(bs.search(9));
	}
}
