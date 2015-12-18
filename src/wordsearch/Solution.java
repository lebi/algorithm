package wordsearch;

public class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        char s=word.charAt(0);
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++){
        		if(board[i][j]==s){
        			char temp=board[i][j];
        			board[i][j]='$';
        			if(find(board,i,j,word,0))
        				return true;
        			board[i][j]=temp;
        		}
        	}
        }
        return false;
    }
    
    public boolean find(char[][] board,int n,int m,String word,int i){
    	if(i>=word.length()-1)
    		return true;
    	if(n>0)
    		if(board[n-1][m]==word.charAt(i+1)){
    			board[n-1][m]='$';
    			if(find(board,n-1,m,word,i+1))
    				return true;
    			board[n-1][m]=word.charAt(i+1);
    		}
    			
    	if(m>0)
    		if(board[n][m-1]==word.charAt(i+1)){
    			board[n][m-1]='$';
    			if(find(board,n,m-1,word,i+1))
    				return true;
    			board[n][m-1]=word.charAt(i+1);
    		}
    	if(n<board.length-1)
    		if(board[n+1][m]==word.charAt(i+1)){
    			board[n+1][m]='$';
    			if(find(board,n+1,m,word,i+1))
    				return true;
    			board[n+1][m]=word.charAt(i+1);
    		}
    			
    	if(m<board[0].length-1)
    		if(board[n][m+1]==word.charAt(i+1)){
    			board[n][m+1]='$';
    			if(find(board,n,m+1,word,i+1))
    				return true;
    			board[n][m+1]=word.charAt(i+1);
    		}
    	return false;
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.exist(new char[][] { {'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
    }
}
