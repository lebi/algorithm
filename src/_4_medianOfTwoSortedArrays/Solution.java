package _4_medianOfTwoSortedArrays;

public class Solution {
	public int find(int[] arr1,int s1,int m,int[] arr2,int s2,int n,int k){
		int r1=m-s1;  //the rest length of array;
		int r2=n-s2;
		if(r1<r2)
			return find(arr2, s2, n,arr1,s1,m, k);
		if(r2==0)
			return arr1[k+s1-1];
		if(k==1)
			return Math.min(arr1[s1], arr2[s2]);
		
		int p2=Math.min(k/2, r2);
		int p1=k-p2;
		
		if(arr1[p1+s1-1]>arr2[p2+s2-1])
			return find(arr1,s1,m,arr2,s2+p2,n,k-p2);
		else if(arr1[p1+s1-1]<arr2[p2+s2-1])
			return find(arr1,s1+p1,m,arr2,s2,n,k-p1);
		return arr1[p1+s1-1];
	}
	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int m=nums1.length;
    	int n=nums2.length;
    	
    	int all=m+n;
    	if(all%2==0){
    		return find(nums1,0,m,nums2,0,n,all/2)+find(nums1,0,m,nums2,0,n,all/2+1)/2;
    	}else
    		return find(nums1,0,m,nums2,0,n,all/2+1);
    }
}
