package _68_textJustification;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result=new ArrayList();
        int len=0;
    	String tmp="";
        for(int i=0;i<words.length;i++){
        	if(i==0){
        		result.add(words[i]);
        		continue;
        	}
        	if(result.get(len).length()+words[i].length()+1>maxWidth){
        		len++;
        		result.add(words[i]);
        	}else {
        		String a=result.get(len)+" ";
        		result.set(len, a+words[i]);
        	}
        }
        for(int m=0;m<result.size();m++){
        	String[] arr=result.get(m).split(" ");
        	if(m==result.size()-1)
        		arr=new String[]{result.get(m)};
        	int x=0;
        	int size=arr.length;
        	if(size==1)
        		x=maxWidth-result.get(m).length();
        	else{
        		x=(maxWidth-result.get(m).length()+size-1)/(size-1);
        		x+=(maxWidth-result.get(m).length()+size-1)%(size-1)==0?0:1;
        	}
        	int sum=result.get(m).length()-size+1;
        	String add="";
    		for(int j=0;j<x;j++){
    			for(int i=0;i<arr.length;i++){
        			if(i==arr.length-1&&i!=0)
        				break;
        			if(sum<maxWidth){
        				arr[i]+=" ";
        				sum++;
        			}else break;
        		}
        	}
        	for(int i=0;i<arr.length;i++){
        		add+=arr[i];
        	}
        	result.set(m,add);
        }
        return result;
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	int[][] arr={ { 3 },{ 6 },{ 9 },{ 12 }};
    	System.out.println(so.fullJustify(new String[] {""}, 12));
    }
}
