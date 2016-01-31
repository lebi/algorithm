package _66_plusone;

import java.util.Arrays;


public class Solution {
    public int[] plusOne(int[] digits) {
    	int len=digits.length;
    	int[] res=new int[digits.length+1];
    	res[len]=(digits[len-1]+1)%10;
    	int add=(digits[len-1]+1)/10;
        for(int i=digits.length-2;i>=0;i--){
        	res[i+1]=(digits[i]+add)%10;
        	add=(digits[i]+add)/10;
        }
    	System.out.println(Arrays.toString(res));
    	System.out.println(len);
        if(add==0)
        	return Arrays.copyOfRange(res, 1, 1+len);
        res[0]=add;
        return res;
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	int[] arr={0};
    	System.out.println(Arrays.toString(so.plusOne(arr)));
    }
}
