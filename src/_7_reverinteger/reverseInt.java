package _7_reverinteger;
public class reverseInt {
    public int reverse(int x){
    	boolean flag=true;
    	if(x<0){
    		flag=false;
    		x=-x;
    	}
//    	System.out.println(x);
        long reverse=0;
        while(x>0){
        	int n=x%10;
        	reverse=reverse*10+n;
        	x/=10;
        }
        System.out.println(reverse);
//        System.out.println(Integer.MAX_VALUE);
        if(reverse > Integer.MAX_VALUE)return 0;
        if(flag) return (int) reverse;
        return (int) -reverse;
    }
    public static void main(String[] args){
    	reverseInt re=new reverseInt();
    	System.out.println(re.reverse(1563847412));
    }
}
