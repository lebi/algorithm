package _71_simplifypath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        if(path.endsWith("/"))
        	path.substring(0, path.length()-1);
        String[] arr=path.split("/");
        System.out.println(Arrays.toString(arr));
        Stack<String> stack=new Stack();
        for(int i=0;i<arr.length;i++){
        	if(arr[i].length()==0)continue;
        	if(arr[i].equals("..")){
        		if(!stack.isEmpty())
            		stack.pop();
        	}else if(!arr[i].equals("."))
        		stack.push(arr[i]);
        }
        if(stack.isEmpty()) return "/";
        String res="";
        while(!stack.isEmpty()){
        	res="/"+stack.pop()+res;
        }
        return res;
    }
    
    public static void main(String[] arg){
    	Solution so=new Solution();
    	System.out.println(so.simplifyPath("//..."));
    }
}
