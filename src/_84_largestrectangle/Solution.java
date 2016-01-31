package _84_largestrectangle;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] height) {
    	Stack<Integer> s=new Stack<Integer>();
    	int[] start=new int[height.length];
    	int[] end=new int[height.length];
    	for(int i=0;i<height.length;i++){
    		while(!s.isEmpty()&&height[s.peek()]>height[i]){
    			end[s.pop()]=i;
    		}
    		if(s.isEmpty())
    			start[i]=0;
    		else
    			start[i]=s.peek()+1;
    		s.push(i);
    	}
    	while(!s.isEmpty())
    		end[s.pop()]=height.length;
    	int max=0;
    	for(int i=0;i<height.length;i++)
    		max=max>((end[i]-start[i])*height[i])?max:((end[i]-start[i])*height[i]);
    	return max;
    }  
}