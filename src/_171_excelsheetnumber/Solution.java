package _171_excelsheetnumber;

public class Solution {
    public int titleToNumber(String s) {
    	int res=0;
        for(int i=0;i<s.length();i++){
        	res*=26;
        	res+=(s.charAt(i)-'A'+1);
        }
        return res;
    }
    
    public static void main(String[] args){
    	Solution so=new Solution();
    	System.out.println(so.titleToNumber("A"));
    }
}
