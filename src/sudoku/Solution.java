package sudoku;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
        	int[] row=new int[10];
        	int[] col=new int[10];
        	int[] sub=new int[10];
        	for(int j=0;j<board[i].length;j++){
        		if(board[i][j]!='.'){
        			if(row[board[i][j]-'0']==1)return false;
        			else row[board[i][j]-'0']=1;
        		}
        		if(board[j][i]!='.'){
        			if(col[board[j][i]-'0']==1)return false;
	    			else col[board[j][i]-'0']=1;
        		}
        		if(board[3*(i/3)+j/3][3*(i%3)+j%3]!='.'){
        			if(sub[board[3*(i/3)+j/3][3*(i%3)+j%3]-'0']==1)return false;
        			else sub[board[3*(i/3)+j/3][3*(i%3)+j%3]-'0']=1;
        		}
        	}
        }
        
        return true;
    }
}
