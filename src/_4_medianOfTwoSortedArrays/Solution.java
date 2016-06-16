package _4_medianOfTwoSortedArrays;

public class Solution {
	public int find(int[] arr1,int s1,int m,int[] arr2,int s2,int n,int k){
		int r1=m-s1;  
		int r2=n-s2;
		//比较数组剩余长度，使arr2小于arr1
		if(r1<r2)
			return find(arr2, s2, n,arr1,s1,m, k);
		if(r2==0)
			return arr1[k+s1-1];
		if(k==1)
			return Math.min(arr1[s1], arr2[s2]);
		
		//arr2的向后移动距离
		int p2=Math.min(k/2, r2);
		int p1=k-p2;
		
		if(arr1[p1+s1-1]>arr2[p2+s2-1])
			//arr1较大，arr2向后移动
			return find(arr1,s1,m,arr2,s2+p2,n,k-p2);
		else if(arr1[p1+s1-1]<arr2[p2+s2-1])
			//反之，arr1向后移动
			return find(arr1,s1+p1,m,arr2,s2,n,k-p1);
		return arr1[p1+s1-1];
	}
	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int m=nums1.length;
    	int n=nums2.length;
    	
    	int all=m+n;
    	if(all%2==0){
    		return (find(nums1,0,m,nums2,0,n,all/2)+find(nums1,0,m,nums2,0,n,all/2+1))/2.0;
    	}else
    		return find(nums1,0,m,nums2,0,n,all/2+1);
    }
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//    	int m=nums1.length;
//    	int n=nums2.length;
//    	
//    	int all=m+n;
//    	int []arr=new int[all/2+1];
//    	
//    	int m1=0,n1=0,i=0;
//    	while(i<arr.length){
//    		if(m1==nums1.length)
//    			arr[i++]=nums2[n1++];
//    		else if(n1==nums2.length)
//    			arr[i++]=nums1[m1++];
//    		else{
//    			if(nums1[m1]>nums2[n1])
//    				arr[i++]=nums2[n1++];
//    			else
//    				arr[i++]=nums1[m1++];
//    		}
//    	}
//    	if(all==1)
//    		return arr[0];
//    	if(all%2==0)
//    		return (arr[all/2-1]+arr[all/2])/2.0;
//    	else
//    		return arr[all/2-1];
//    }
}
