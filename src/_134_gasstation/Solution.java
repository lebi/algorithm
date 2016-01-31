package _134_gasstation;

import java.util.Arrays;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] arr=Arrays.copyOf(gas, gas.length*2);
        System.arraycopy(gas, 0, arr, gas.length, gas.length);
        
        int i=0,s=0,rest=0;
        int len=gas.length;
        while(i<len*2){
        	if(rest+gas[i%len]-cost[i%len]>=0){
        		rest=rest+gas[i%len]-cost[i%len];
        		i++;
        		System.out.println(i);
        		System.out.println(s);
        	}
        	else{
        		if(s<i){
        			rest=rest+cost[s]-gas[s];s++;
        		}else{
        			s++;i++;
        		}
        	}
        	if(i>=s+len)return s;
        	if(s>=len)return -1;
        }
        return -1;
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.canCompleteCircuit(new int[]{1,2}, new int[]{2,1}));
    }
}
