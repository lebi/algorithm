package _77_combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<List<Integer>> res=new ArrayList();
    public List<List<Integer>> combine(int n, int k) {
        for(int i=1;i<=n;i++){
        	List a=new ArrayList();
        	a.add(i);
        	res.add(a);
        }
        for(int i=1;i<k;i++){
        	List temp=new ArrayList();
        	for(List<Integer> l:res){
        		for(int j=l.get(l.size()-1)+1;j<=n;j++){
        			List<Integer> add=new ArrayList(l);
        			add.add(j);
        			temp.add(add);
        		}
        	}
        	res=temp;
        }
        return res;
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	List<List<Integer>> res=so.combine(4, 2);
    	for(List l:res)
    		System.out.println(l);
    }
}
