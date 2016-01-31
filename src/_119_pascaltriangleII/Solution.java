package _119_pascaltriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        res.add(1);
        for(int i=0;i<rowIndex;i++){
            List<Integer> temp=new ArrayList<>(res);
            res=new ArrayList<>();
            res.add(1);
            for(int j=0;j<temp.size()-1;j++)
                res.add(temp.get(j)+temp.get(j+1));
            res.add(1);
        }
        return res;
    }
}