package sqrt;

public class Solution {
    public int mySqrt(int x) {
    	long high=x,low=0;
    	long t=x;
    	while(low<high){
    		long mid=(high+low)/2;
    		if(mid*mid>t)high=mid;
    		else if(mid*mid<t)low=mid+1;
    		else return (int)mid;
    	}
    	if(high*high>t)
    		return (int)high-1;
    	else return (int)high;
    }
}
