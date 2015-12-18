package pow;


public class Solution {
    public double myPow(double x, int n) {
        double res=1;
        long mi=n;
        boolean flag=true;
        if(mi<0){
        	flag=false;
        	mi=-mi;
        }
        while(true){
        	if(mi==0)
        		break;
        	if(mi==1){
        		res=res*x;
        		break;
        	}
        	double m=x;
        	long i=2;
        	for(;i<=mi;i*=2){
        		m=m*m;
        	}
        	mi-=i/2;
        	res*=m;
        }
		if(flag)
			return res;
		else return 1/res;
    }
    public static void main(String[] arg){
    	String[] arr={"",""};
    	Solution so=new Solution();
    	System.out.println(so.myPow(0.00001, 2147483647));
    }
}
