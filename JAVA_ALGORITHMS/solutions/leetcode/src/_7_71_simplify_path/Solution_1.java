package _7_71_simplify_path;

import java.util.List;
import java.util.Stack;

public class Solution_1 {
	public static void main(String[] args) {
		System.out.println(simplifyPath("/home/"));
		System.out.println(simplifyPath("/a/./b/../../c/"));
	}
	
	public static String simplifyPath(String path) {
        //if you find "", ".", "..", dont push to stack
		// if you find "..", pop the stack
		
		String[] list = path.split("/");
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < list.length; i++){
			String str = list[i];
			if(str.equalsIgnoreCase("")){
				//dont push				
			}else if(str.equalsIgnoreCase(".")){
				//dont push				
			}else if(str.equalsIgnoreCase("..")){
				if(!stack.isEmpty()){
					stack.pop();					
				}
			}else{
				stack.push(str);
			}									
		}
		
		String result = "";
		while(!stack.isEmpty()){
			result = "/" + stack.pop() + result;
		}
		
		if(path.length() > 0 && result.equalsIgnoreCase("")){
			result = "/";
		}
		
		return result;
    }
}
