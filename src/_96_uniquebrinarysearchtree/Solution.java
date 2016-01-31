package _96_uniquebrinarysearchtree;

import java.util.Arrays;

public class Solution {
    public int numTrees(int n) {
    	if(n==0)return 0;
        int[] arr=new int[n];
        arr[0]=1;
        for(int i=1;i<n;i++){
        	int count=0;
        	for(int j=0;j<=i;j++){
        		int add;
        		if(i-j==0)
        			add=arr[j-1];
        		else if(j==0)
        			add=arr[i-j-1];
        		else
        			add=arr[i-j-1]*arr[j-1];
        		count+=add;
        	}
        	arr[i]=count;
        }
        return arr[n-1];
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.numTrees(4));
    }
}
