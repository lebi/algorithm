package _128_longestconsecutivesquence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestConsecutive(int[] nums) {
    	int max=0;
    	if(nums.length==0)return 0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], 1);
        }
        for(int i=0;i<nums.length;i++){
        	int sum=1;
        	map.put(nums[i], 0);
        	int small=nums[i]-1;
        	while(map.containsKey(small)&&map.get(small)!=0){
        		sum++;
        		map.put(small, 0);
        		small--;
        	}
        	
        	int big=nums[i]+1;
        	while(map.containsKey(big)&&map.get(big)!=0){
        		sum++;
        		map.put(big, 0);
        		big++;
        	}
        	max=Math.max(max, sum);
        }
        return max;
    }
}