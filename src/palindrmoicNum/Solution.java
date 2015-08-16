package palindrmoicNum;

public class Solution {
	public boolean isPalindrome(int x) {
		int temp=x;
		boolean flag=true;
		if(x<0) {x=-x; flag=false;return false;}
		long res=0;
		while(x>0){
			res=res*10+x%10;
			x/=10;
		}
		if(!flag) res=-res;
		System.out.println((int)res);
		if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE) return false;
		if((int)res==temp)return true;
		else return false;
	}
	public static void main(String[] arg){
		Solution so=new Solution();
		so.isPalindrome(-2147447412);
	}
}
