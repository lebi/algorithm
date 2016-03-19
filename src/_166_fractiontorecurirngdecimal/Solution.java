package _166_fractiontorecurirngdecimal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String fractionToDecimal(int numerator, int denominator) {
        boolean sign=(numerator>=0&&denominator>=0)||(numerator<=0&&denominator<=0);
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);
        StringBuilder res=new StringBuilder();
        if(!sign)
        	res.append("-");
        res.append(String.valueOf(num/den));
        List<Long> list=new ArrayList<Long>();
        long rest=num%den;
        if(rest==0)
        	return res.toString();
        
        res.append(".");
        while(list.indexOf(rest)<0){
        	if(rest==0){
        		return res.toString();
        	}
        	list.add(rest);
        	res.append(rest*10/den);
        	rest=rest*10%(long)den;
        }
        res.insert(res.length()-list.size()+list.indexOf(rest), "(");
        return res.append(")").toString();
    }
	public static void main(String[] args) {
		Solution so=new Solution();
		System.out.println(so.fractionToDecimal(-1,-2147483648));
		long a=(long)1000000000*10;
		System.out.println(Math.abs(Integer.MIN_VALUE));
	}

}
