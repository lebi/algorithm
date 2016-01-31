package _17_lettercombination;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
    	char[][] list={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    	List<String> res=new ArrayList();
    	for(int i=0;i<digits.length();i++){
    		int d=digits.charAt(i)-'0';
			int s=res.size();
			if(s==0) for(int j=0;j<list[d].length;j++)
    				res.add(String.valueOf(list[d][j]));
			else{ 
				List<String> temp=new ArrayList();
				for(int n=0;n<s;n++)
	    			for(int j=0;j<list[d].length;j++){
	    				temp.add(res.get(n)+list[d][j]);
	    			}
				res=temp;
			}
    	}
        return res;
    }
    public static void main(String[] args){
    	Solution so=new Solution();
    	int[] sum={1,1,1,0};
    	System.out.println(so.letterCombinations("23"));
    }
}
