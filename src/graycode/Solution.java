package graycode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res=new ArrayList<>();
        res.add(0);
        for(int i=0;i<n;i++){
        		List<Integer> temp=new ArrayList<>();
        		for(Integer l:res){
        			temp.add(l);
        		}
        		for(int j=res.size()-1;j>=0;j--){
        			temp.add(res.get(j)+(1<<i));
        		}
        		res=temp;
        	}
        return res;
    }
}
