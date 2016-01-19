package _139wordbreak;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
    	boolean[] memo=new boolean[s.length()];
    	if(memo.length==0)return false;
    	memo[0]=wordDict.contains(s.substring(0,1));
    	for(int i=1;i<s.length();i++){
    		for(int j=i;j>=0;j--){
    			boolean check=wordDict.contains(s.substring(j,i+1));
    			if(j==0){
    				memo[i]=check;
    				break;
    			}
    			if(memo[j-1]&&check){
    				memo[i]=check;
    				break;
    			}
    		}
    	}
//    	System.out.println(Arrays.toString(memo));
    	return memo[s.length()-1];
    }
    
//    public boolean check(String s,Set<String> dict,int b){
//    	if(b>=s.length())return true;
//    	
//    	for(int n=b+1;n<=s.length();n++){
//    		String str=s.substring(b,n);
////    		System.out.println(b);
//    		if(dict.contains(str)){
//    			if(check(s,dict,n))
//    				return true;
//    		}
//    	}
//    	return false;
//    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	Set<String> set=new HashSet<>();
    	set.add("leet");
    	set.add("code");
    	System.out.println(so.wordBreak("leetcode", set));
    }
}
