package _118_pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0)return res;
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        res.add(list);
        for(int i=1;i<numRows;i++){
            List<Integer> newlist=new ArrayList<Integer>();
            newlist.add(1);
            for(int k=0;k<res.get(i-1).size()-1;k++){
                newlist.add(res.get(i-1).get(k)+res.get(i-1).get(k+1));
            }
            newlist.add(1);
            res.add(newlist);
        }
        return res;
    }
}