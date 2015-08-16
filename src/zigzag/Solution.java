package zigzag;

public class Solution {
    public String convert(String s, int numRows) {
    	String ret="";
    	int loop;
		if(numRows>1)
    		loop=(numRows-1)*2;
    	else return s;
		int down=0;
    	for(int i=0;i<numRows;i++){
    		int row=i;
    		while(row<s.length()){
    			if(down==0||down==loop){
    				ret+=s.charAt(row);
    				row+=loop;
    			}else{
    				ret+=s.charAt(row);
    				row+=loop-down;
    				if(row>=s.length()) break;
    				ret+=s.charAt(row);
    				row+=down;
    			}
    		}
    		down+=2;
    	}
    	return ret;
    }
    
    public static void main(String[] argc){
    	Solution so=new Solution();
    	System.out.println(so.convert("AB",3));
    }
}
