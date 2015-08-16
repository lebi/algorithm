package inttoroman;

public class Solution {
    public String intToRoman(int num) {
    	 String[][] roman = {  
    			{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},  
    			{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},  
    	        {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},  
    	        {"", "M", "MM", "MMM"}  
    	};
    	 int len=0;
    	 String res="";
    	while(num>0){
    		int n=num%10;
    		res+=roman[len][n];
    		len++;
    		num/=10;
    	}
    	return res;
    }
}
