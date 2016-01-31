package _54_spiralmatrix;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> res=new ArrayList();
    	int row=matrix.length;
    	if(row==0)return res;
    	int col=matrix[0].length;
    	int cell=0;
    	int i=0,j=0;
    	boolean flag=false;
        while(true){
    		res.add(matrix[i][j]);
        	if(j<col-cell-1&&i==cell){
        		j++;
        	}
        	else if(j==col-cell-1&&i<row-cell-1){
        		i++;
        	}
        	else if(j>cell&&i==row-cell-1)
        		j--;
        	else if(j==cell&&i>cell){
        		i--;
        		flag=true;
        	}
        		
        	if(res.size()==row*col) return res;
        	if(i==cell+1&&j==cell&&flag){
        		cell++;
        		flag=false;
        	}
        }
    }
        public static void main(String[] arg){
        	Solution so=new Solution();
        	int[][] arr={ { 3 },{ 6 },{ 9 },{ 12 }};
        	System.out.println(so.spiralOrder(arr));
        }
}
