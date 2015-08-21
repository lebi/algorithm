package divide;

public class Solution {
//	int[] res=new int[32];
	long res=0;
	long c=1;
    public int divide(int dividend, int divisor) {
    	boolean flag=true;
    	long a=dividend;
    	long b=divisor;
    	if(a<0){
    		a=-a;
    		flag=!flag;
    	}    	
    	if(b<0){
    		b=-b;
    		flag=!flag;
    	}
    	if(divisor==0)return Integer.MAX_VALUE;
    	mydiv(a,b);
//    	
    	if(flag){
    		if(res>>1>Integer.MAX_VALUE) return Integer.MAX_VALUE;
    		else return (int)(res>>1);
    	}else {
    		if(-res>>1<Integer.MIN_VALUE) return Integer.MAX_VALUE;
    		return (int)-(res>>1);
    	}
    }
    
    public long mydiv(long dividend,long divisor){
		c=c<<1;
    	if(dividend>=divisor){
    		long dend=mydiv(dividend,divisor<<1);
    		c=c>>1;
    		if(dend>=divisor){
    			res+=c;
    			return dend-divisor;
    		}
    		else return dend;
    	}else{
    		return dividend;
    	}
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.divide(-2147483648, 1));
    }
}
