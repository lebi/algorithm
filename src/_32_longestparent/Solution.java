package _32_longestparent;

import java.util.Stack;


public class Solution {
    public int longestValidParentheses(String s) {
    	char[] arr=s.toCharArray();
    	Stack<Integer> stack=new Stack<Integer>();
    	int count=0,max=0,start=-1;
        for(int i=0;i<s.length();i++){
        	if(arr[i]=='(')
        		stack.push(i);
        	if(arr[i]==')'){
        		if(stack.isEmpty()){
        			start=i;
        		}else {
        			stack.pop();
        			int n=start;
        				if(!stack.isEmpty())
        					n=start>stack.peek()?start:stack.peek();
        			count=i-n;
                	max=count>max?count:max;
        		}
        	}
        }
        return max;
    }
    public static void main(String[] a){
    	Solution so=new Solution();
    	System.out.println(so.longestValidParentheses("((((((((((((((((((((((((((((((((((((((((((((((((((((("));
    }
}
