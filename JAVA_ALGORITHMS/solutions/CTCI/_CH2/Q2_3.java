package _CH2;

import com.hp.linklist.Link;
import com.hp.linklist.LinkList;

/*
 * Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a- >b- >d->e
 */

public class Q2_3 {

	/*
	 * SOlution 1 : If you  have access to the previous node and next node then we can just do current.previous = current.next; and we are done 
	 */
	
	
	/*
	 * Solution 2: If you have only have access to next node then 
	 * first we can copy the value of next node to current node then delete the next node
	 */
	private static void deleteNode(Link node) {
		Link current = node;
		if(current == null){
			return;
		}
		
		if(current.next == null){
			current = null;
		}
		
		// copy the value of next node to current node
		current.data = current.next.data;		
		
		//Now delte the current.next node
		current.next = current.next.next;
			
		
	}
	
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		list.displayList();
		System.out.println("----------------");
		
		Link node = list.first.next.next;
		list.first.next.next.displayLink();
		
		deleteNode(node);
		System.out.println("----------------");
		
		list.displayList();
	}
	
}
