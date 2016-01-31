package _11_mostwater;

public class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
        	int min=height[l]>height[r]?height[r]:height[l];
        	int space=min*(r-l);
        	max=max>space?max:space;
        	if(height[l]>height[r]) r--;
        	else l++;
        }
        return max;
    }
}
