package _115distinctsub;

import java.util.Arrays;

public class Solution {
    public int numDistinct(String s, String t) {
    	int[][] arr=new int[t.length()][s.length()];
    	for(int i=0;i<t.length();i++)
    		for(int j=0;j<s.length();j++)
    			if(t.charAt(i)==s.charAt(j))
    				arr[i][j]=1;
    	
    	for(int i=0;i<arr.length;i++)
    		System.out.println(Arrays.toString(arr[i]));
    	int[] store=new int[t.length()];
    	int count=0;
    	for(int i=t.length()-1;i>=0;i--){
    		int j=s.length()-1;
    		if(i!=t.length()-1)j=store[i+1]-1;
    		while(j>=0){
    			if(arr[i][j]==1){
    				store[i]=j;
    				break;
    			}
    			j--;
    		}
    		if(j<0)return count;
    	}
    	count++;
		System.out.println(Arrays.toString(store));
    	
    	for(int i=0;i<t.length();i++){
    		int j=store[i]-1;
    		int qian=-1;
    		if(i>0)
    			qian=store[i-1];
    		while(j>qian){
    			if(arr[i][j]==1){
    				System.out.println(i+":"+j);
    				count++;
    				store[i]=j;
    			}
    			j--;
    		}
    	}
    	return count;
    }
    public static void main(String[] args){
    	Solution so=new Solution();
    	so.numDistinct("aabb", "ab");
    }
}
