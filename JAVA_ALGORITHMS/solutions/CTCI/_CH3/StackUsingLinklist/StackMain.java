package _CH3.StackUsingLinklist;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		stack.push("g");
		stack.push("o");
		stack.push("d");
		
		System.out.println(stack.peek().data);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
				
			
	}

}
