package _140wordbreakII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	List<String> list=new ArrayList<>();
	String s;
    public List<String> wordBreak(String s, Set<String> wordDict) {
    	List<List<Integer>> store=new ArrayList<>();
    	this.s=s;
    	for(int i=0;i<s.length();i++){
			List<Integer> jlist=new ArrayList<>();
    		for(int j=i;j>=0;j--){
    			String str=s.substring(j,i+1);
    			if((j==0||store.get(j-1).size()!=0)&&wordDict.contains(str)){
    				jlist.add(j);
    			}
    		}
			store.add(jlist);
    	}
    	System.out.println(store);
    	
		add(store,"",store.size());
    	System.out.println(list);
    	return list;
    }
    
    public void add(List<List<Integer>> store,String after,int b){
    	if(b==0) {
    		list.add(after.substring(0,after.length()-1));
    	}else{
    		for(int i=0;i<store.get(b-1).size();i++){
        		int j=store.get(b-1).get(i);
    			String str=s.substring(j,b);
    			add(store,str+" "+after,j);
    		}
    	}
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	Set<String> set=new HashSet<>();
    	set.add("leet");
    	set.add("code");
    	System.out.println(so.wordBreak("leetcode", set));
    }
}
