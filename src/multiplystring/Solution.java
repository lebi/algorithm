package multiplystring;

import java.util.Arrays;

public class Solution {
    public String multiply(String num1, String num2) {
        int a[]=new int[num1.length()];
        int temp[]=new int[num1.length()+1];
        int b[]=new int[num2.length()];
        int res[]=new int[num1.length()+num2.length()];
        
        for(int i=0;i<num1.length();i++)
        	a[i]=num1.charAt(i)-'0';
        for(int i=0;i<num2.length();i++){
        	int b1=num2.charAt(i)-'0';
        	multi(a,b1,temp);
        	add(res,temp,i);
        }
        StringBuffer ret=new StringBuffer();
        boolean flag=true;
        for(int i=0;i<res.length;i++){
        	if(res[i]==0&&flag)continue;
        	ret.append(res[i]);
        	flag=false;
        }
        if(ret.length()==0)
        	ret.append(0);
        return ret.toString();
    }
    
    public void multi(int[] a,int b,int[] temp){
    	int m=0;
    	for(int i=a.length-1;i>=0;i--){
    		temp[i+1]=(m+a[i]*b%10)%10;
    		m=(m+a[i]*b)/10;
    	}
    	temp[0]=m;
    }
    
    public void add(int[] res,int[] a,int i){
    	int m=0;
    	for(int j=a.length-1;j>=0;j--){
    		int pre=res[j+i];
    		res[j+i]=(a[j]+m+pre)%10;
    		m=(a[j]+m+pre)/10;
    	}
    	for(int j=i-1;j>=0;j--){
    		System.out.println(m);
    		int pre=res[j];
    		res[j]=(pre+m)%10;
    		m=(pre+m)/10;
    	}
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.multiply("999", "999"));
    }
}
