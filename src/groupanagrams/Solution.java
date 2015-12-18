package groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> result=new ArrayList();
        Map<String,List> map=new HashMap();
        for(int i=0;i<strs.length;i++){
        	String lex=lex(strs[i]);
        	if(map.containsKey(lex)){
        		List<String> list=map.get(lex);
        		for(int j=0;j<list.size();j++){
        			if(compare(list.get(j),strs[i])) {
        				list.add(j,strs[i]);break;
        			}
        			else if(j==list.size()-1) {
        				list.add(j+1,strs[i]);
        				break;
        			}
        			else continue;
        		}
        	}else{
        		List list=new LinkedList();
        		list.add(strs[i]);
        		map.put(lex, list);
        	}
        }
        
        Iterator it=map.keySet().iterator();
        while(it.hasNext())
        	result.add(map.get(it.next()));
        return result;
        
    }

    public String lex(String a){
    	char[] arr=a.toCharArray();
    	Arrays.sort(arr);
    	return new String(arr);
    }
    
    public boolean compare(String a,String b){
    	for(int i=0;i<a.length();i++)
    		if(a.charAt(i)>b.charAt(i))
    			return true;
    		else if(a.charAt(i)<b.charAt(i))
    			return false;
    		else continue;
    	return true;
    }
    
    public static void main(String[] arg){
    	String[] arr={"",""};
    	Solution so=new Solution();
    	System.out.println(so.groupAnagrams(arr).size());
    }

}
