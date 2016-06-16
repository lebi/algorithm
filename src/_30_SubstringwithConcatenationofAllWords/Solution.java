package _30_SubstringwithConcatenationofAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	List<Integer> res=new ArrayList<Integer>();
	Map<String, Integer> mem=new HashMap<>();
	int len;
	public List<Integer> findSubstring(String s, String[] words) {
		if(words.length==0)
			return res;
		len=words[0].length()*words.length;
    	for(String i:words){
    		if(mem.containsKey(i))
    			mem.put(i, mem.get(i)+1);
    		else
    			mem.put(i, 1);
    	}
    	int pos=0;
    	while(true){
    		pos=find(s,pos,words);
	        System.out.println(pos);
    		if(pos+len>s.length()){
    	        System.out.println(res);
    			return res;
    		}
    			
    	}
	}
  
	int find(String s,int index,String[] words){
    	Map<String, Integer> map=new HashMap<>();
		int clen=words[0].length();
		int min=len+index;
		for(int i=0;i<clen;i++){
			map.clear();
			for(int j=words.length-1;j>=0;j--){
				int left=index+i+j*clen,right=left+clen;
				if(right>s.length())
					return min;
				String str=s.substring(left,right);
        		if(!mem.containsKey(str)){
        			min=Math.min(min, right);
    				break;
        		}
        		if(!map.containsKey(str))
        			map.put(str, 1);
        		else
        			map.put(str, map.get(str)+1);
        		if(mem.get(str)<map.get(str)){
        			min=Math.min(min, right);
        			break;
        		}
        		if(j==0){
        			res.add(index+i);
        			min=Math.min(index+clen, min);
        		}
			}
		}
		return min;
	}
    
    public static void main(String[] args){
    	Solution so=new Solution();
    	so.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"});
    }
}
