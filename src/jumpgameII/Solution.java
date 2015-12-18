package jumpgameII;


public class Solution {
    public int jump(int[] nums) {
    	int i=0;
    	int count=0;
    	while(i<nums.length-1){
    		int max=i+1;
    		for(int j=i+1;j<=nums[i]+i;j++)
    			if(j<nums.length-1){
    				max=j-i+nums[j]>max-i+nums[max]?j:max;
    			}else return count+1;
    		i=max;
    		count++;
    	}
    	return count;
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	int[] arr={2,3,1,1,4};
    	System.out.println(so.jump(arr));
    }
}
