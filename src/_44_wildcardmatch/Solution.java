package _44_wildcardmatch;

public class Solution {
    public boolean isMatch(String s, String p) {
    	int i=0,j=0;
    	int star=-2,match=-2;
    	
    	while(i<s.length()){
    		if(j>=p.length()){
    			if(star>=0){
        			j=star;i=match+1;
        			continue;
    			}else return false;
    		}
    		if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
    			i++;j++;
    			continue;
    		}
    		
    		if(p.charAt(j)=='*'){
    			star=j++;
    			match=i;
    			continue;
    		}
    		
    		if(s.charAt(i)!=p.charAt(j)){
    			if(star!=-2){
    				j=star+1;
    				match++;
    				i=match;
    				continue;
    			}
    		}
    		return false;
    	}
    	
    	while(j<p.length()&&p.charAt(j)=='*')
    		j++;
    	return j==p.length();
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.isMatch("a",""));
    }

}
