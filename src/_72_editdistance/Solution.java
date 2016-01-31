package _72_editdistance;

public class Solution {
    public int minDistance(String word1, String word2) {
        String len=word1.length()>word2.length()?word1:word2;
        String shor=word1.length()>word2.length()?word2:word1;
        int[] pos=new int[shor.length()];
        int[] count=new int[shor.length()];
        for(int i=0;i<shor.length();i++){
        	for(int j=i;j<len.length();j++){
        		if(shor.charAt(i)==len.charAt(j)){
        			pos[i]=j;
        			int max=0;
        			for(int n=0;n<i;n++){
        				if(pos[n]<j)
        					max=count[n];
        			}
        			count[i]=max+1;
        			break;
        		}
        	}
        }
        int max=0;
        for(int i=0;i<count.length;i++)
        	max=count[i]>max?count[i]:max;
        return len.length()-max;
    }
}
