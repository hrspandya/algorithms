package com.hp.stack.validateDelimiters;

public class ValidateDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean matched = matchDelimiter("3 + 4] + (1*{1 + 2})");
		
		System.out.println(matched);
	}
	
	
	public static boolean matchDelimiter(String str){
		int length = str.length();
		
		Stack st = new Stack(10);
		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '['){
				st.push(ch);
			}else if(ch == ')' || ch == '}' || ch == ']'){
				char topVal = st.pop();
				
				if( (ch == ')' && topVal != '(') ||
					(ch == '}' && topVal != '{') ||
					(ch == ']' && topVal != '[')){
					return false;
				}
			}
		}
		
		return true;
	}

}
