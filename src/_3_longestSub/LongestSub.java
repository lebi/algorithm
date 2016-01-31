package _3_longestSub;

public class LongestSub {
    public int lengthOfLongestSubstring(String s) {
        StringBuffer sb=new StringBuffer();
        int longest=0;
        for(int i=0;i<s.length();i++){
        	int index=sb.indexOf( String.valueOf(s.charAt(i)) );
        	if( index < 0){
        		sb.append(s.charAt(i));
        	}else{
        		longest=longest>sb.length()?longest:sb.length();
        		sb=new StringBuffer(sb.substring(index+1));
        		sb.append(s.charAt(i));
        	}
        }
		longest=longest>sb.length()?longest:sb.length();
		return longest;
    }
    
    public static void main(String[] args){
    	LongestSub sub=new LongestSub();
    	System.out.println(sub.lengthOfLongestSubstring("bpfbhmipx"));
    }
}
