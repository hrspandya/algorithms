package _CH2;

import com.hp.linklist.Link;
import com.hp.linklist.LinkList;

//Given a circular linked list, implement an algorithm which returns the node at the beginning of the loop.

//DEFINITION
//Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
//2.7

//EXAMPLE
	//Input:A ->B->C->D->E-> C
	//Output:C


public class Q2_6 {

	//First we have two pointers, one slow which moved one step at a time and other fast which moves two steps at a time, 
	//as soon as they both collide we know there is cercular linked list 
	// now keep fast pointer at the same place and move slow pointer to head and move both of them one step at a time and
	// when both collide again that node is the beginning of the loop;
	
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insertWithoutSort(1);
		list.insertWithoutSort(2);
		list.insertWithoutSort(3);
		list.insertWithoutSort(4);
		list.insertWithoutSort(5);
		
		list.displayList();
		
		//Creating circular linked list
		Link current = list.first;
		Link previous = null;
		Link node3 = null;
		while(current != null){
			if(current.data == 3){
				node3 = current;
			}
			
			previous = current;
			current = current.next;
		}
		
		previous.next = node3;
		
		//list.displayList();
		
		
		//Now that we have circular linked list, which will casue infinite loop, 
		//lets detect the circular linked list
		
		boolean collisionDetected = detectCircularLinkList(list);		
		System.out.println(collisionDetected);
		
	}

	private static boolean detectCircularLinkList(LinkList list) { 
		Link slow = list.first;
		Link fast = list.first;
		Link current = list.first;
		boolean isCollisionDetected = false;
		
		while(current != null){
			slow = slow.next;
			fast = fast.next.next;
			current = current.next;
			
			if(slow == fast){				
				//Collision detected
				isCollisionDetected = true;
				break;
			}
		}
		
		
		return isCollisionDetected;
		
	}
	
	
	
}
