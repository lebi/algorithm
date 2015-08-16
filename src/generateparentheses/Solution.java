package generateparentheses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Solution {
    public List<String> generateParenthesis(int n) {
    	List<String> list=new ArrayList();
    	down(n,n,"",list);
    	return list;
    }
    
    public void down(int left,int right,String s,List<String> list){
    	if(left==0&&right==0){
    		list.add(s);
    	}
    	if(left>0)
    		down(left-1,right,s+'(',list);
    	if(right>0&&left<right)
    		down(left,right-1,s+')',list);
    }
    
    public static void main(String[] ar){
    	Solution so=new Solution();
    	System.out.println(so.generateParenthesis(4));
    }
}
