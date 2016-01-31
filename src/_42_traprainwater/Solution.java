package _42_traprainwater;

public class Solution {
    public int trap(int[] height) {
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int leftmax=0,rightmax=0;;
        for(int i=0;i<left.length;i++){
        	if(height[i]>leftmax)
        		leftmax=height[i];
        	left[i]=leftmax;
        	
        	if(height[height.length-1-i]>rightmax)
        		rightmax=height[height.length-1-i];
        	right[height.length-1-i]=rightmax;
        }
        int water=0;
        for(int i=0;i<left.length;i++){
        	left[i]=left[i]>right[i]?right[i]:left[i];
        	water+=left[i]-height[i];
        }
        return water;
    }
}
