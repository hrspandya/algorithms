package _6_61_rotate_list;

import java.util.ArrayList;

public class Solution_1 {

	public static void main(String[] args) {
		ListNode start = new ListNode(0);
		ListNode list = start;
		
		list.next = new ListNode(1);
		list = list.next;		
		list.next = new ListNode(2);
		list = list.next;		
		list.next = new ListNode(3);
		list = list.next;		
		list.next = new ListNode(4);
		
		
		
		ListNode start1 = new ListNode(0);
		ListNode list1 = start1;
		
		list1.next = new ListNode(1);
		list1 = list1.next;		
		list1.next = new ListNode(2);
		list1 = list1.next;		
		list1.next = new ListNode(3);
		
		System.out.println(print(rotateRight(start.next, 2)));
		System.out.println(print(rotateRight(start1.next, 5)));
		
	}
	
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public static ListNode rotateRight(ListNode head, int n) {
	    if(head == null || head.next == null || n == 0){
	    	return head;
	    }
	    
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode slow = dummy;
	    ListNode fast = dummy;
	    
	    //first find the length
	    int length = 0;
	    while(fast.next != null){
	    	fast = fast.next;
	    	length++;
	    }
	    
	    //then find the rotation point
	    for(int j = 0; j < length - (n % length); j++){
	    	slow = slow.next;
	    }
	    
	    //then rotate
	    fast.next = dummy.next;
	    dummy.next = slow.next;
	    slow.next = null;
	    
	    return dummy.next;
	}
	
	
	public static ArrayList print(ListNode list){
		ArrayList li = new ArrayList<>();
		while(list != null){
			li.add(list.val);
			list = list.next;
		}
		
		return li;
	}
}
