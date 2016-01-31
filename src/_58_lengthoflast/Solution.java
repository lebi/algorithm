package _58_lengthoflast;

public class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        int last=len;
        boolean flag=true;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(flag) {
                    last=i;
                    continue;
                }
                else return last-i-1;
            }else{
                if(flag)last=i+1;
                flag=false;
            }
        }
        return last;
    }
}