package _CH3.StackUsingLinklist;

public class Stack<T> {

	Node<T> top;
	
	public Stack(){
		this.top = null;
	}
	
	public void push(T data){
		Node<T> node = new Node<T>(data);
		node.next = top;
		top = node;
	}
	
	public Node<T> pop(){
		if(top == null){
			return null;
		}else{
			Node<T> temp = top;
			top = top.next;
			return temp;
		}		
	}
	
	public Node<T> peek(){
		return top;		
	}
		
}
