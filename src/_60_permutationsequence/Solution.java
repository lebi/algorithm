package _60_permutationsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	
//	List<int[]> res=new ArrayList();
//    public String getPermutation(int n, int k) {
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++)
//        	arr[i]=i+1;
//        permute(arr,0);
//        if(k>res.size())
//        	return null;
//        String a="";
//        for(int i=0;i<n;i++)
//        	a+=res.get(k-1)[i];
//        return a;
//    }
//    
//    public void permute(int[] arr,int n){
//    	if(n==arr.length-1){
//    		res.add(arr);
//    	}
//    	else {
//    		for(int i=n;i<arr.length;i++){
//    			int[] tmp=moveback(arr,i,n);
//    			permute(tmp,n+1);
//    		}
//    	}
//    		
//    }
//    
//    public int[] moveback(int[] arr,int n,int k){
//    	int[] res=new int[arr.length];
//    	for(int i=0;i<k;i++)
//    		res[i]=arr[i];
//    	int m=arr[n];
//    	for(int i=k;i<n;i++)
//    		res[i+1]=arr[i];
//    	res[k]=m;
//    	for(int i=n+1;i<arr.length;i++){
//    		res[i]=arr[i];
//    	}
//    	return res;
//    }
	
	public String getPermutation(int n, int k) {
		k--;
		List<Integer> arr=new LinkedList();
		for(int i=0;i<n;i++)
			arr.add(i+1);
		String res="";
		for(int i=n-1;i>0;i--){
			int mul=1;
			for(int j=i;j>0;j--)
				mul*=j;
			int shan=k/mul;
			res+=arr.get(shan);
			k=k%mul;
			arr.remove(shan);
		}
		res+=arr.get(0);
		return res;
	}
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.getPermutation(1, 1));
    }
}
