package _97_interleavingstring;


import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
    	if(s1.length()+s2.length()!=s3.length())return false;
    	int[][] arr=new int[s1.length()+1][s2.length()+1];
    	for(int i=1;i<s1.length()+1;i++){
    		if(s1.charAt(i-1)==s3.charAt(i-1)){
    			arr[i][0]=i;
    		}else break;
    	}
    	for(int i=1;i<s2.length()+1;i++){
    		if(s2.charAt(i-1)==s3.charAt(i-1)){
    			arr[0][i]=i;
    		}else break;
    	}
    	for(int i=1;i<s1.length()+1;i++)
    		for(int j=1;j<s2.length()+1;j++){
    			int s1i=arr[i-1][j];
    			int s2i=arr[i][j-1];
    			if(s1i>0){
    				if(s1.charAt(i-1)==s3.charAt(s1i))
    					arr[i][j]=s1i+1;
    			}
    			if(s2i>0){
    				if(s2.charAt(j-1)==s3.charAt(s2i))
    					arr[i][j]=s2i+1;
    			}
    		}
    	
//    	for(int i=0;i<arr.length;i++)
//    		System.out.println(Arrays.toString(arr[i]));
    	if(arr[s1.length()][s2.length()]==s1.length()+s2.length())
    		return true;
    	return false;
    }
}
