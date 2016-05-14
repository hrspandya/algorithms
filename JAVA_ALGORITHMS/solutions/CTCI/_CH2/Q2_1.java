package _CH2;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

import com.hp.linklist.Link;
import com.hp.linklist.LinkList;

import CtCILibrary.LinkedListNode;

/*
 * Write code to remove duplicates from an unsorted linked list. 
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 */


public class Q2_1 {
	
	
	/*
	 * First we loop through linklist and add values to hash map, if during loop we see that hash map already has the value,
	 * it means its duplicate and need to be removed from linklist.
	 */
	private static void deleteDuplicate(LinkList linklist) {
		
		Hashtable<Double, Boolean> table = new Hashtable<>(); 
		Link current = linklist.first;
		Link previous = null;
		
		while(current != null){
			if(table.containsKey(current.data)){
				//duplicate found, remove it
				current = current.next;
				previous.next = current;
			}else{
				table.put(current.data, true);
				previous = current;
				current = current.next;
			}
		}
				
	}
	
	
	
	/*
	 * FOLLOW UP
	 * How would you solve this problem if a temporary buffer is not allowed?
	 * If you do not want to use the temp buffer then we need to use brute force 
	 * for first element, loop through all others and see if they are same, if so remove otherwise go to next, n^2 solution
	 */
	public static void deleteDuplicatesWithoutMap(LinkList linklist){
		
		Link current = linklist.first;
	
		while(current != null){
			
			Link runner = current;
			
			while(runner.next != null){				
				if(runner.next.data == current.data){
					//duplicate found, remove it 
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}				
			}
			
			current = current.next;						
		}

	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		LinkList linklist = new LinkList();
		linklist.insert(0, 1);
		linklist.insert(0, 3);
		linklist.insert(0, 1);
		linklist.displayList();
		
		deleteDuplicate(linklist);
		
		System.out.println("---------------------");		
		
		linklist.displayList();
		
		System.out.println("---------------------");
		System.out.println("Delete without Map");
		deleteDuplicatesWithoutMap(linklist);
		linklist.displayList();
		
	}	
	
}
