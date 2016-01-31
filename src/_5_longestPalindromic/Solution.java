package _5_longestPalindromic;

import java.util.Scanner;


public class Solution {
    public String longestPalindrome(String s) {
        int right=0;
        int max=0;
        int[] store=new int[s.length()*2+1];
        char[] news=new char[s.length()*2+1];
        
        news[0]='|';
        for(int i=0;i<s.length();i++){
        	news[i*2+1]=s.charAt(i);
        	news[i*2+2]='|';
        }
        int i=0;
        while(i<news.length){
        	int min=0;
			if(2*right-i>=0)
				min=store[right]/2+right-i>store[2*right-i]/2?store[2*right-i]/2:store[right]/2+right-i;
        	min=min>1?min:1;
        	while(i+min<news.length&&i-min>=0){
        		if(news[i-min]==news[i+min])
        			min++;
        		else break;
        	}
    		max=store[max]>min*2-1?max:i;
        	store[i]=min*2-1;
        	right=store[right]/2+right>store[i]/2+i?right:i;
        	i++;
        }
        String result="";
        System.out.println(max);
        System.out.println(store[max]);
        for(int j=max-store[max]/2;j<=max+store[max]/2;j++)
        	if(news[j]!='|') result+=news[j];
        return result;
    }
	public static void main(String[] args){
		Solution main=new Solution();
		 System.out.println(main.longestPalindrome("aaaad"));
	}
}
