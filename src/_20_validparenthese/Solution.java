package _20_validparenthese;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
//        int a=0,b=0,c=0;
//        int recent=0;
//        int down=0;
    	Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++){
        	switch (s.charAt(i)) {
			case '(':
				stack.push('(');
				break;
			case '[':
				stack.push('[');
				break;
			case '{':
				stack.push('{');
				break;
			case ')':
				if(stack.isEmpty()||stack.pop()!='(') return false;
				break;
			case ']':
				if(stack.isEmpty()||stack.pop()!='[') return false;
				break;
			case '}':
				if(stack.isEmpty()||stack.pop()!='{') return false;
				break;
			default:
				break;
			}
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
