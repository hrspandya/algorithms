package _2_20_brackets_matching;

import java.util.Stack;

public class Solution_1 {
	
	/*
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

		The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	 */
	
	public static void main(String[] args) {		
		System.out.println("Input : ()[]{}    Output : " + isValid("()[]{}"));
		System.out.println("Input : ([)]    Output : " + isValid("([)]"));
		
		System.out.println("Input : [{(}]    Output : " + isValid("[{(}]"));
	}
	
	
	public static boolean isValid(String s){
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == '('){				
				stack.push(')');
				
			}else if(c == '{'){
				stack.push('}');
				
			}else if(c == '['){
				stack.push(']');
				
			}else if(stack.isEmpty()){
				return false;
				
			}else if(c == stack.pop()){
				//continue;
			}else{
				return false;
				
			}
		}
		
		if(stack.isEmpty()){
			return true;
		}
		
		return false;
	}

}
