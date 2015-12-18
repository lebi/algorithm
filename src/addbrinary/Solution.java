package addbrinary;

import java.util.Arrays;

public class Solution {
    public String addBinary(String a, String b) {
        String len,shor,res="";
        if(a.length()>b.length()){
        	len=a;
        	shor=b;
        }else{
        	len=b;
        	shor=a;
        }
        int add=0;
        
        for(int i=0;i<shor.length();i++){
        	res=((len.charAt(len.length()-1-i)-'0')+(shor.charAt(shor.length()-1-i)-'0')+add)%2+res;
        	add=((len.charAt(len.length()-1-i)-'0')+(shor.charAt(shor.length()-1-i)-'0')+add)/2;
        }
        
        for(int i=shor.length();i<len.length();i++){
        	res=((len.charAt(len.length()-1-i)-'0')+add)%2+res;
        	add=((len.charAt(len.length()-1-i)-'0')+add)/2;
        }
        if(add==0)
        	return res;
        return 1+res;
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	int[] arr={0};
    	System.out.println(so.addBinary("1111", "1"));
    }
}
