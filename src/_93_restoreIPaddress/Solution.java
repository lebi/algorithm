package _93_restoreIPaddress;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
    	List<String> res=new ArrayList<>();
    	if(s.length()>12||s.length()<4)
    		return res;
        for(int a=1;a<=s.length()-3;a++){
        	if(a>3)break;
        	String ip1=s.substring(0,a);
        	System.out.println("ip1"+ip1);
        	if(ip1.charAt(0)=='0'&&ip1.length()>1)
        		break;
        	int num1=Integer.parseInt(ip1);
        	if(num1>255)
        		break;
        	for(int b=a+1;b<=s.length()-2;b++){
        		String ip2=s.substring(a,b);
            	System.out.println("ip2"+ip2);
            	if(ip2.charAt(0)=='0'&&ip2.length()>1)
            		break;
            	int num2=Integer.parseInt(ip2);
            	if(num2>255)
            		break;
        		for(int c=b+1;c<=s.length()-1;c++){
            		String ip3=s.substring(b,c);
                	System.out.println("ip3"+ip3);
                	if(ip3.charAt(0)=='0'&&ip3.length()>1)
                		break;
                	int num3=Integer.parseInt(ip3);
                	if(num3>255)
                		break;
                	
        			String ip4=s.substring(c);
                	System.out.println("ip4"+ip4);
                	if(ip4.charAt(0)=='0'&&ip4.length()>1)
                		continue;
                	int num4=Integer.parseInt(ip4);
                	if(num4>255)
                		continue;
                	res.add(ip1+"."+ip2+"."+ip3+"."+ip4);
        		}
        	}
        }
        return res;
    }
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.restoreIpAddresses("25525511135"));
    }
}
