package _CH2;

import com.hp.linklist.LinkList;

/*
 * Write code to partition a linked list around a value x, 
 * such that all nodes less than x come before all nodes greater than or equal to x.
 */

public class Q2_4 {

	/*
	 * Solution 1:
	 * 
	 * First you can create 2 linked list , one which has all lower values, and other which has same and higher values
	 * then we can join this two linklist.
	 */
	
	
	/*
	 * Solution 2:  Basically we are trying to sort this Linklist.
	 * In this case just create new linklist and during insert, insert them in order and we are done, 
	 */
	
	/*
	 * You can also use slow and fast, initially both are pointing at root, 
	 * then fast will be compared with x, and so on
	 */
	
	
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insert(4);
		list.insert(2);
		list.insert(1);
		list.insert(5);
		list.insert(3);
		
		list.displayList();
		
	}
}
