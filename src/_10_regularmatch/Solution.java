package _10_regularmatch;

public class Solution {
//    public boolean isMatch(String s, String p) {
//    	if(s.length()==0){
//    		if(p.length()%2!=0)
//    			return false;
//    		for(int i=1;i<p.length();i+=2)
//    			if(p.charAt(i)!='*')
//    				return false;
//    		return true;
//    	}
//    	
//    	if(p.length()==0)
//    		return false;
//    	
//    	if(p.length()==1)
//    		if(s.length()==1&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.'))
//    			return true;
//    		else
//    			return false;
//    	if(p.charAt(1)!='*'){
//        	if(p.charAt(0)=='.'||p.charAt(0)==s.charAt(0))
//        		return isMatch(s.substring(1), p.substring(1));
//        	else return false;
//    	}
//    	if(p.charAt(0)=='.'||p.charAt(0)==s.charAt(0))
//    		if(isMatch(s, p.substring(2)))
//    			return true;
//    		else
//    			return isMatch(s.substring(1), p);
//    	else
//    		return isMatch(s, p.substring(2));
//    	
//    }
	
	public boolean check(char[] s,int s1,char[] p,int p1){
		int slen=s.length-s1,plen=p.length-p1;
    	if(slen==0){
    		if(plen%2!=0)
    			return false;
    		for(int i=p1+1;i<p.length;i+=2)
    			if(p[i]!='*')
    				return false;
    		return true;
    	}
    	
    	if(plen==0)
    		return false;
    	
    	if(plen==1)
    		if(slen==1&&(s[s1]==p[p1]||p[p1]=='.'))
    			return true;
    		else
    			return false;
    	
    	if(p[p1+1]!='*'){
        	if(p[p1]=='.'||p[p1]==s[s1])
        		return check(s,s1+1, p,p1+1);
        	else return false;
    	}
    	if(p[p1]=='.'||p[p1]==s[s1])
    		if(check(s, s1,p,p1+2))
    			return true;
    		else
    			return check(s,s1+1, p,p1);
    	else
    		return check(s,s1, p,p1+2);
	}
    public boolean isMatch(String s, String p) {
    	return check(s.toCharArray(),0,p.toCharArray(),0);
    }
}
