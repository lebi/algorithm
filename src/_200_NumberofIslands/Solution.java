package _200_NumberofIslands;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hzhuangyan1 on 2017/12/20.
 */
class Solution {
    int wid;
    int high;
    public int numIslands(char[][] grid) {
        wid = grid.length;
        if(wid == 0)
            return 0;
        int c=0;
        high = grid[0].length;
        for(int i = 0; i < wid; i++){
            for(int j = 0;j < high; j++){
                if(grid[i][j] == '1'){
                    mark(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }

    public void mark(char[][] grid, int i,int j){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);queue.offer(j);
        while(!queue.isEmpty()){
            int a = queue.poll();
            int b = queue.poll();
            if(grid[a][b] == '1'){
                grid[a][b] = '2';
                if(a > 0){
                    queue.offer(a-1);queue.offer(b);
                }
                if(b > 0){
                    queue.offer(a);queue.offer(b-1);
                }
                if(a < wid - 1){
                    queue.offer(a+1);queue.offer(b);
                }
                if(b < high - 1){
                    queue.offer(a);queue.offer(b+1);
                }
            }
        }
    }
}