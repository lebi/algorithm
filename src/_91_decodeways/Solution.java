package _91_decodeways;

public class Solution {
    public int numDecodings(String s) {
    	if(s.length()==0)return 0;
    	return find(s,0);
//        int count=1;
//        boolean flag=true;
//        for(int i=s.length()-1;i>=0;i--){
//        	if(s.charAt(i)=='0'){
//        		if(i==0||(s.charAt(i-1)!='1'&&s.charAt(i-1)!='2'))return 0;
//        	}
//        	if(s.charAt(i)=='1'||s.charAt(i)=='2'){
//        		if(i==s.length()-1)continue;
//        		if(s.charAt(i+1)=='0')
//        			continue;
//        		else{
//        			if((s.charAt(i)-'0')*10+s.charAt(i+1)-'0'<=26){
//            			if(i<s.length()-2&&s.charAt(i+2)=='0')
//                			continue;
//        				count++;
//        			}
//        		}
//        	}
//        }
//        return count;
    }
    
    public int find(String s,int b){
    	if(b>=s.length()-1)return 1;
    	if(s.charAt(b)=='0')
    		return 0;
    	if(s.charAt(b)=='1'||s.charAt(b)=='2'){
    		if(s.charAt(b+1)=='0')
    			return find(s,b+2);
    		if((s.charAt(b)-'0')*10+s.charAt(b+1)-'0'<=26){
    			return find(s,b+1)+find(s,b+2);
    		}
    	}
    	return find(s,b+1);
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.find("7541387519572282368613553811323167125532172369624572591562685959575371877973171856836975137559677665", 0));
    }
}
