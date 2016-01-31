package _130_surrendregion;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	int n;
	int m;
	Queue<Integer> queue=new LinkedList<>(); 
    public void solve(char[][] board) {
        n=board.length;
        if(n==0)return;
        m=board[0].length;
        for(int i=0;i<n;i++){
        	bfs(board,i,0);
        	bfs(board,i,m-1);
        }
        for(int i=0;i<m;i++){
        	bfs(board,0,i);
        	bfs(board,n-1,i);
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                if(board[i][j]=='O')board[i][j]='X';
                if(board[i][j]=='N')board[i][j]='O';
            }
    }
    public void bfs(char[][] board,int i,int j){
    	add(board,i,j);
    	while(!queue.isEmpty()){
    		int c=queue.poll();
    		int a=c/m;
    		int b=c%m;

        	System.out.println("n"+n);
        	System.out.println(c);
        	System.out.println("ab"+a+":"+b);

    		add(board,a-1,b);
    		add(board,a,b-1);
    		add(board,a+1,b);
    		add(board,a,b+1);
    	}
    }
    public void add(char[][] board,int i,int j){
    	if(i<0||i>=n||j<0||j>=m)return;
    	if(board[i][j]!='O')return;

    	queue.offer(i*m+j);
    	System.out.println(i+":"+j);
    	board[i][j]='N';
    }

    public void dfs(char[][] board,int i,int j){
        if(i < 0 || i >= n || j < 0 || j >= m) return; 
        if(board[i][j]=='X'||board[i][j]=='N')return;
        board[i][j]='N';
        dfs(board,i-1,j);
        dfs(board,i,j-1);
        dfs(board,i+1,j);
        dfs(board,i,j+1);
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	so.solve(new char[][]{"XOXOXO".toCharArray(),"OXOXOX".toCharArray(),"XOXOXO".toCharArray(),"OXOXOX".toCharArray()});
    }
}
