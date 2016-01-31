package _120_triangle;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=1;i<triangle.size();i++)
            for(int j=0;j<triangle.get(i).size();j++){
                if(j==0){
                    triangle.get(i).set(0, triangle.get(i-1).get(0)+triangle.get(i).get(0));
                }else if(j==triangle.get(i).size()-1){
                    int t=triangle.get(i).size()-1;
                    triangle.get(i).set(t, triangle.get(i).get(t) +triangle.get(i-1).get(t-1));
                }else{
                    int t=triangle.get(i-1).get(j)<triangle.get(i-1).get(j-1)?triangle.get(i-1).get(j):triangle.get(i-1).get(j-1);
                    triangle.get(i).set(j, t+triangle.get(i).get(j));
                }
            }
        int last=triangle.size()-1;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<triangle.get(last).size();i++){
            max=max<triangle.get(last).get(i)?max:triangle.get(last).get(i);
        }
        return max;
    }
}