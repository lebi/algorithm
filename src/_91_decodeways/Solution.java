package _91_decodeways;

public class Solution {
    public int numDecodings(String s) {
    	int self=0,comb=0,before,count=0;;
    	if(s.length()==0||s.charAt(0)=='0')
    		return 0;
    	before=s.charAt(0)-'0';
    	if(before==1||before==2)
    		comb=1;
    	else
    		self=1;
    	count=1;
    	for(int i=1;i<s.length();i++){
			if(s.charAt(i)=='0'&&comb==0){
				return 0;
			}
    		if(before*10+s.charAt(i)-'0'<=26){
    			if(s.charAt(i)=='0'){
    				count-=self;
    				self=count;
    				comb=0;
    				continue;
    			}
    			count=count+comb;
    			if(s.charAt(i)=='1'||s.charAt(i)=='2'){
    				self=comb;
    				comb=count-self;
    			}else{
    				self=count;
    				comb=0;
    			}
    		}else{
    			if(s.charAt(i)=='1'||s.charAt(i)=='2'){
    				self=0;
    				comb=count;
    			}else{
    				self=count;
    				comb=0;
    			}
    		}
    		before=s.charAt(i)-'0';
    	}
		return count;
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
    	System.out.println(so.numDecodings("110"));
    }
}
