package _74_search2Dmatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	int n=matrix.length,m=matrix[0].length;
        int i=0,j=m-1;
        while(true){
        	if(matrix[i][j]==target)return true;
        	else if(matrix[i][j]>target)j--;
        	else i++;
        	
        	if(j<0||i>=n)return false;
        }
    }
    
    boolean find(int[][] ma,int n,int m,int t){
    	for(int i=n;i>=0;i--){
    		if(ma[i][m]==t)return true;
    		else if(ma[i][m]<t)break;
    	}
    	for(int i=m;i>=0;i--){
    		if(ma[n][i]==t)return true;
    		else if(ma[n][i]<t)break;
    	}
    	return false;
    }
}
