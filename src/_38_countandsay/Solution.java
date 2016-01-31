package _38_countandsay;

public class Solution {
    public String countAndSay(int n) {
        if(n==1)
        	return String.valueOf(1);
        else{
            String value=countAndSay(n-1);
            String ret="";
            int count=1;
            for(int i=0;i<value.length()-1;i++){
            	if(value.charAt(i)==value.charAt(i+1)){
            		count++;
            	}else{
            		ret=ret+count+value.charAt(i);
            		count=1;
            	}
            }
            ret=ret+count+value.charAt(value.length()-1);
            return ret;
        }
    }
}
