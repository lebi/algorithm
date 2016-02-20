package _10_regularmatch;

public class Solution {
    public boolean isMatch(String s, String p) {
    	if(s.length()==0){
    		if(p.length()%2!=0)
    			return false;
    		for(int i=1;i<p.length();i+=2)
    			if(p.charAt(i)!='*')
    				return false;
    		return true;
    	}
    	
    	if(p.length()==0)
    		return false;
    	
    	if(p.length()==1)
    		if(s.length()==1&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.'))
    			return true;
    		else
    			return false;
    	if(p.charAt(1)!='*'){
        	if(p.charAt(0)=='.'||p.charAt(0)==s.charAt(0))
        		return isMatch(s.substring(1), p.substring(1));
        	else return false;
    	}
    	if(p.charAt(0)=='.'||p.charAt(0)==s.charAt(0))
    		if(isMatch(s, p.substring(2)))
    			return true;
    		else
    			return isMatch(s.substring(1), p);
    	else
    		return isMatch(s, p.substring(2));
    	
    }
}
