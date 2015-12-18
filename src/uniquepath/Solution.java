package uniquepath;

public class Solution {
//    public int uniquePaths(int m, int n) {
//    	if(m==1||n==1)return 1;
//        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
//    }
	public int uniquePaths(int m, int n) {
		int[][] metrix=new int[m][n];
		for(int i=0;i<m;i++)
			metrix[i][0]=1;
		for(int i=0;i<n;i++)
			metrix[0][i]=1;
		for(int i=1;i<m;i++)
			for(int j=1;j<n;j++){
				metrix[i][j]=metrix[i-1][j]+metrix[i][j-1];
			}
		return metrix[m-1][n-1];
	}
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.uniquePaths(23,12));
    }
}
