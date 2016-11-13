package _CH2;

import com.hp.linklist.Link;
import com.hp.linklist.LinkList;

/*
 * You have two numbers represented by a linked list, where each node contains a single digit. 
 * The digits are stored in reverse order, such that the Ts digit is at the head of the list. 
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * 
 * EXAMPLE
 * Input:(7-> 1 -> 6) + (5 -> 9 -> 2). That is,617 + 295.
 * Output: 2 -> 1 -> 9.That is, 912.
 */



public class Q2_5 {
	
	/*
	 * Solution 1: Just add them normally one digit at a time
	 */
	private static String addNumbers(LinkList list1, LinkList list2) {
		String result = "";
		LinkList l1 = null;
		LinkList l2 = null;
		Link current1 = null;
		Link current2 = null;
		
		if(list1.length > list2.length){
			l1 = list1;
			l2 = list2;
		}else{
			l1 = list2;
			l2 = list1;
		}
		
		current1 = l1.first;
		current2 = l2.first;
		
		while(current1 != null){
			double value = 0;
			if(current2 != null){
				value = current1.data + current2.data;
			}else{
				value = current1.data + 0;
			}
		
			String str = String.valueOf(value);
			result = result + str.substring(str.length() - 1, str.length());
			
			current1 = current1.next;
		}
		
		return result;	
	}
	
	/*
	 * Solution 2 : multiply each digit based on their rank and then add them
	 */
	
	public static void main(String[] args) {
		LinkList list1 = new LinkList();
		list1.insert(1);
		list1.insert(9);
		list1.insert(9);
		
		list1.displayList();
		
		
		LinkList list2 = new LinkList();
		list2.insert(1);
		list2.insert(8);
		list2.insert(9);
		
		list2.displayList();
		
		System.out.println(addNumbers(list1, list2));
		
	}
	
}
