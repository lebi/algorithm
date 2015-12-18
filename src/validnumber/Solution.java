package validnumber;


public class Solution {
    public boolean isNumber(String s) {
        try{
        	int st=0,e=s.length();
        	for(int i=0;i<s.length();i++){
        		if(s.charAt(i)==' ')st=i+1;
        		else break;
        	}
        	for(int i=s.length()-1;i>=0;i--)
        		if(s.charAt(i)==' ')e=i;
        		else break;
        	if(st>=e)return false;
        	String format=s.substring(st, e);
        	System.out.println(Double.parseDouble(format));
        	return true;
        }catch(Exception e){
        	return false;
        }
    }

    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.isNumber(" 3 "));
    }
}
