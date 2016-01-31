package _8_stringtoint;

public class Solution {
    public int myAtoi(String str) {
    	boolean hasRead=false;
    	boolean symbol=false;
    	boolean flag=true;
    	int len=0;
    	long result=0;
    	for(int i=0;i<str.length();i++){
    		if(str.charAt(i)==' '&&!hasRead) continue;
    		if(str.charAt(i)==' '&&hasRead) break;
    		System.out.println(result);
    		if((str.charAt(i)=='+'||str.charAt(i)=='-')&&symbol) break;
    		if(str.charAt(i)=='+'||str.charAt(i)=='-'){
    			if(str.charAt(i)=='-') flag=false;
    			symbol=true;
    			hasRead=true;
    		}else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
    			len++;
    			result=result*10+(str.charAt(i)-'0');
    			symbol=true;
    			hasRead=true;
    		}else break;
    	}
    	if(!flag) result=-result;
    	if(flag&&len>10)return Integer.MAX_VALUE;
    	else if(!flag&&len>10) return Integer.MIN_VALUE;
    	if(result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
    	else if(result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
    	return (int)result;
    }
    public static void main(String[] args){
    	Solution so=new Solution();
    	System.out.println(so.myAtoi("  -0012a42"));
    }
}
