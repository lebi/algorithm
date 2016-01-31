package _123_besttimetosellstockIII;

public class Solution {
    public int maxProfit(int[] prices) {
        int[] left=new int[prices.length];
        int[] right=new int[prices.length];
        if(prices.length==0)return 0;
        int temp=prices[0];
        for(int i=1;i<prices.length;i++){
            temp=Math.min(temp,prices[i]);
            left[i]=Math.max(left[i-1],prices[i]-temp);
        }
        temp=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            temp=Math.max(temp,prices[i]);
            right[i]=Math.max(right[i+1],temp-prices[i]);
        }
        temp=0;
        for(int i=0;i<prices.length;i++)
            temp=Math.max(temp,left[i]+right[i]);
        return temp;
    }
}