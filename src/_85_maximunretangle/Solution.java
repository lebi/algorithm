package _85_maximunretangle;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        if(n==0)return 0;
        int m=matrix[0].length;
        int[][] height=new int[n][m];
        
        for(int j=0;j<m;j++){
        	int count=0;
        	for(int i=0;i<n;i++){
        		if(matrix[i][j]=='1'){
        			count++;
        			height[i][j]=count;
        		}else count=0;
        	}
        }
        int max=0;
        for(int i=0;i<n;i++){
        	System.out.println(Arrays.toString(height[i]));
        	int s=findMax(height[i]);
        	max=max>s?max:s;
        }
        return max;
    }
    
    public int findMax(int[] height){
    	Stack<Integer> s=new Stack<Integer>();
    	int max=0;
    	int[] begin=new int[height.length];
    	int[] end=new int[height.length];
    	for(int i=0;i<height.length;i++){
    		if(height[i]!=0){
    			if(s.isEmpty()){
    				begin[i]=i;
    				s.push(i);
    			}else{
    				if(height[s.peek()]<height[i]){
    					s.push(i);
    					begin[i]=i;
    				}
    				else{
    					int peak=0;
    					while(!s.isEmpty()&&height[s.peek()]>height[i]){
    						int start=s.pop();
    						max=(i-begin[start])*height[start]>max?(i-begin[start])*height[start]:max;
    						peak=start;
    					}
    					if(s.isEmpty()){
    						begin[i]=peak;
    					}
    					else begin[i]=s.peek()+1;
    					s.push(i);
    				}
    			}
    		}else{
    			while(!s.isEmpty()){
    				int start=s.pop();
					max=(i-begin[start])*height[start]>max?(i-begin[start])*height[start]:max;
    			}
    		}
    	}
		while(!s.isEmpty()){
			int start=s.pop();
			max=(height.length-begin[start])*height[start]>max?(height.length-begin[start])*height[start]:max;
		}
    	return max;
    }
    
}