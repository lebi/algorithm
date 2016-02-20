package _127_wordladder;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<String> strQ=new LinkedList<>();
        Queue<Integer> levelQ=new LinkedList<>();
        strQ.offer(beginWord);
        levelQ.offer(1);
        while(!strQ.isEmpty()){
        	String top=strQ.poll();
        	int l=levelQ.poll();
        	if(checkWord(top,endWord)) return l+1;
        	for(String str:check(top,wordList)){
        		strQ.offer(str);
        		levelQ.offer(l+1);
        	}
        }
        return 0;
    }
    
    public boolean checkWord(String a,String b){
    	int count=0;
    	for(int i=0;i<a.length();i++){
    		if(count>1)return false;
    		if(a.charAt(i)==b.charAt(i))
    			count++;
    	}
    	if(count==1)return true;
    	return false;
    }
    
    public List<String> check(String a,Set<String> wordList){
    	List<String> res=new ArrayList<String>();
    	for(int i=0;i<a.length();i++){
    		char[] arr=a.toCharArray();
    		char tmp=arr[i];
    		for(int j=0;j<26;j++){
    			if('a'+j!=tmp){
    				arr[i]=(char)('a'+j);
    				String str=String.valueOf(arr);
    				if(wordList.contains(str)){
    					res.add(str);
    					wordList.remove(str);
    				}
    			}
    		}
    	}
    	return res;
    }
}
