package _168_excelsheetcolumntitle;

public class Solution {
    public String convertToTitle(int n) {
        StringBuilder res=new StringBuilder();
        int rest=n;
        while(rest!=0){
        	int off=rest%26;
        	off=off==0?26:off;
        	res.insert(0,(char)('A'+off-1));
        	rest=rest%26==0?rest/26-1:rest/26;
        }
        
        return res.toString();
    }
	public static void main(String[] args) {
		Solution so=new Solution();
		System.out.println(so.convertToTitle(26));
	}
}
