package _CH2;

import com.hp.linklist.Link;
import com.hp.linklist.LinkList;

/*
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */


public class Q2_2 {

	/*
	 * First solution if we know the length of the linked list we can loop through all elements and reach to kth element easily 
	 */
	private static Link findKthToLastElement(LinkList linklist, int k) {
		
		Link current = linklist.first;
		int count = 1;
		
		//if k is bigger than linklist, then return null since, we cant do that.
		if(k > linklist.length){
			return null;
		}
		
		while(current != null){
			if(count == linklist.length - k){
				return current;
			}
			current = current.next;
			count++;
		}
		
		return null;
	}
	
	
	
	
	
	/*
	 * If interviewer wants to solve it without finding the length then we can use recursion.
	 * Recursion:  Recursion means you solve the small problem and then solve problem returns value which gets used to solve other problems.
	 * 
	 * First we use recursion with breaking condition current != null, if null it returns 0, so we know last element is 0th, now 0 gets fed to 
	 * previous method which returns 1, which then gets fed to previous method which returns 2, and so on, 
	 * we keep checking the position and return the result
	 */
	private static double findKthToLastElement2(LinkList linklist, int k) {
		Link current = linklist.first;
		
		return nthToLastElement(current, k);
		
	}
	
	private static double nthToLastElement(Link link, int k){
		Link current = link;
		if(current == null){
			return 0;
		}
		
		double i = nthToLastElement(current.next, k);
		if(i == k){
			return current.data;
		}
		
		return i;
	}
	
	public static void main(String[] args) {
		LinkList linklist = new LinkList();
		linklist.insert(1);
		linklist.insert(2);
		linklist.insert(3);
		linklist.insert(4);
		linklist.insert(5);
		linklist.insert(6);
		linklist.insert(7);
		linklist.displayList();
		
		System.out.println("------------------------");
		Link result1 = findKthToLastElement(linklist, 1);
		if(result1 != null){
			result1.displayLink();
		}		
		
		
				
	}
	
}
