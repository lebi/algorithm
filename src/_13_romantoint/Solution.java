package _13_romantoint;

public class Solution {
    public int romanToInt(String s) {
   	 String[][] roman = {  
 			{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},  
 			{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},  
 	        {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},  
 	        {"", "M", "MM", "MMM"}  
   	 	};
   	 	int res=0;
   	 	int start=0;
   	 	for(int i=roman.length-1;i>=0&&start<s.length();i--){
   	 		for(int j=roman[i].length-1;j>=0&&start<s.length();j--){
   	 			int len=roman[i][j].length();
   	 			if(start+len>s.length()) continue;
   	 			if(roman[i][j].equals(s.substring(start, start+len))){
   	 				start+=len;
   	 				res=(int) (res+j*Math.pow(10, i));
   	 				break;
   	 			}
   	 		}
   	 	}
   	 	return res;
    }
    public static void main(String[] args){
    	Solution so=new Solution();
    	System.out.println(so.romanToInt("DCXXI"));
    }
}
