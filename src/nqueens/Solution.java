package nqueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	List<List<String>> result=new ArrayList();
    public List<List<String>> solveNQueens(int n) {
    	char[][] matrix=new char[n][n];
    	char[][] xstore=new char[n][n];
    	for(int i=0;i<n;i++)
    		for(int j=0;j<n;j++){
    			matrix[i][j]='.';
    			xstore[i][j]='.';
    		}
    	System.out.println(check(matrix,xstore,n));
    	return result;
    }
    
    public boolean check(char[][] matrix,char[][] xstore,int n){
    	if(n==0){
//    		for(int a=0;a<matrix.length;a++)
//    			System.out.println(Arrays.toString(matrix[a]));
    		List<String> list=new ArrayList();
    		for(int i=0;i<matrix.length;i++){
    			String s="";
    			for(int j=0;j<matrix.length;j++){
    				s+=String.valueOf((char)matrix[i][j]);
    			}
    			list.add(s);
    		}
    		result.add(list);
    		return true;
    	}
    	int s=matrix.length;
    	for(int i=0;i<s;i++){
    		if(n==s&&i>=1)return false;
    		for(int j=0;j<s;j++){
    			if(xstore[i][j]=='.'){

    				char[][] arr=new char[s][s];
    				char[][] queen=new char[s][s];
//    		    	for(int a=0;a<s;a++)
//    		    		for(int b=0;b<s;b++){
//        		    		arr[a][b]=xstore[a][b];
//        		    		queen[a][b]=matrix[a][b];		
//    		    		}
    		    	for(int a=0;a<s;a++){
    		    		arr[a]=Arrays.copyOf(xstore[a],xstore[a].length);
    		    		queen[a]=Arrays.copyOf(matrix[a],matrix[a].length);
    		    	}
    		    		
    				for(int k=0;k<s;k++){
    					arr[i][k]='X';
    					arr[k][j]='X';
    					if(i-k>=0&&j-k>=0)arr[i-k][j-k]='X';
    					if(i+k<s&&j+k<s)arr[i+k][j+k]='X';
    					if(i+k<s&&j-k>=0)arr[i+k][j-k]='X';
    					if(i-k>=0&&j+k<s)arr[i-k][j+k]='X';
    				}
    				queen[i][j]='Q';
//    	    		for(int a=0;a<s;a++)
//    	    			System.out.println(Arrays.toString(queen[a]));
//    	    		for(int a=0;a<s;a++)
//    	    			System.out.println(Arrays.toString(arr[a]));
//	    			System.out.println();
    				if(check(queen,arr,n-1)&&n<s)
    					return true;
    			}
    		}
    	}
    	return false;
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.solveNQueens(9).size());
    }

}
