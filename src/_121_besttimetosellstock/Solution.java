package _121_besttimetosellstock;
public class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int[] arr=new int[prices.length];
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]+arr[i-1]>0){
                arr[i]=arr[i-1]+prices[i]-prices[i-1];
            }
        }
        for(int i:arr)
            max=i>max?i:max;
        return max;
    }
}