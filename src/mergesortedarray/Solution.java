package mergesortedarray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=n-1,j=m-1;
        while(i>=0&&j>=0){
        	if(nums1[j]>nums2[i]){
        		swap(nums1,i+j+1,j);
        		j--;
        	}else{
        		nums1[i+j+1]=nums2[i];
        		i--;
        	}
        }
        while(i>=0){
        	nums1[i]=nums2[i];
        	i--;
        }
    }
    public void swap(int[] arr,int i,int j){
    	int t=arr[i];
    	arr[i]=arr[j];
    	arr[j]=t;
    }
}
