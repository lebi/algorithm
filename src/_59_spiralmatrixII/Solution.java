package _59_spiralmatrixII;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int i=0,j=0,c=1,bord=0;
        while(c<=n*n){
        	if(i==bord&&j==bord+1)bord++;
        	res[j][i]=c;
        	c++;
        	if(i<n-bord-1&&j==bord)
        		i++;
        	else if(i==n-bord-1&&j<n-bord-1)
        		j++;
        	else if(i>bord&&j==n-bord-1)
        		i--;
        	else if(i==bord&&j>bord+1)
        		j--;
        	System.out.println(i+","+j);
        }
        return res;
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	so.generateMatrix(2);
    }
}