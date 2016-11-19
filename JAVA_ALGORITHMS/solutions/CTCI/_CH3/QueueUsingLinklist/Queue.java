package _CH3.QueueUsingLinklist;

public class Queue<T> {

	public Node<T> first;
	public Node<T> last;
	
	public Queue(){
		this.first = null;
		this.last = null;
	}
	
	public void enQueue(T data){
		Node<T> node = new Node<T>(data);
		if(first == null){			
			this.first = node;
			this.last = node;
		}else{			
			last.next = node;
			last = node;
		}
	}
	
	
	public Node<T> deQueue(){
		if(first == null){
			return null;
		}else{			
			Node<T> temp = first;
			first = first.next;
			return temp;
		}		
	}
	
	
}
