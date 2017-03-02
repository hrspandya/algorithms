package _CH3.StackUsingLinklist;

public class Stack<T> {

	Node<T> top;
	Node<T> min;
	
	public Stack(){
		this.top = null;
		this.min = null;
	}
	
	public void push(T data){
		Node<T> node = new Node<T>(data);
		node.next = top;
		top = node;
		
//		if(this.min != null){			
//			if(this.min.data < node.data){				
//				//do nothing
//			}else{
//				this.min.data = node.data;
//			}
//		}
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
