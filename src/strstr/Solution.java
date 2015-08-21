package strstr;

import java.util.Arrays;

public class Solution {
	private int[] fail;
	public void failure(String need){
		fail=new int[need.length()];
		if(need.length()==0)return;
		fail[0]=-1;
		for(int i=1;i<fail.length;i++){
			int before=fail[i-1];
			while(true){
				if(need.charAt(i)==need.charAt(before+1)){
					fail[i]=before+1;
					break;
				}else if(before<0){
					fail[i]=-1;
					break;
				}else 
					before=fail[before];
			}
		}
	}
	
    public int strStr(String haystack, String needle) {
    	failure(needle);
    	if(needle.length()==0)return 0;
    	if(haystack.length()==0)return -1;
    	int j=0;int i=0;
    	while(true){
        	if(j==needle.length()) return i-j;
        	if(i==haystack.length()) return -1;
        	if(needle.charAt(j)==haystack.charAt(i)){
        		i++;j++;
        	}else if(j>0){
        		j=fail[j-1];j++;
        	}else{
        		i++;j=0;
        	}
    	}
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.strStr("mississippi", "issipi"));
    }
}
