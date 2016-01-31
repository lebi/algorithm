package _125_validpalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int a=0,b=s.length()-1;
        while(a<b){
            if(!check(s.charAt(a))){
                a++;
                continue;
            }else if(!check(s.charAt(b))){
                b--;
                continue;
            }
            if(s.charAt(a)!=s.charAt(b)){
                char m=s.charAt(a);
                char n=s.charAt(b);
                if((m>='0'&&m<='9'))return false;
                if(Math.abs(m-n)!=('a'-'A'))return false;
            }
            a++;
            b--;
        }
        return true;
    }
    
    public boolean check(char a){
        if((a<='z'&&a>='a')||(a>='A'&&a<='Z')||(a>='0'&&a<='9'))
            return true;
        return false;
    }
}