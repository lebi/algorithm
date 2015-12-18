package rotateimage;

public class Solution {
    public void rotate(int[][] matrix) {
        int into=matrix[0].length;
        int right=into-1;
        for(int i=0;i<into/2;i++){
        	for(int j=i;j<into-i-1;j++){
        		swap(matrix,i,j,j,right-i);
        		swap(matrix,i,j,right-i,right-j);
        		swap(matrix,i,j,right-j,i);
        	}
        }
    }
    public void swap(int[][] m,int i,int j,int n,int k){
    	int temp=m[i][j];
    	m[i][j]=m[n][k];
    	m[n][k]=temp;
    }
    
}