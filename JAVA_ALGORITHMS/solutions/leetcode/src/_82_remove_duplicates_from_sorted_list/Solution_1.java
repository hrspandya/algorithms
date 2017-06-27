package _82_remove_duplicates_from_sorted_list;

public class Solution_1 {
	/*
	 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

		For example,
		Given 1->2->3->3->4->4->5, return 1->2->5.
		Given 1->1->1->2->3, return 2->3.
	 */	
	public static void main(String[] args) {
		ListNode start = new ListNode(0);
		ListNode list = start;
		list.next = new ListNode(1);
		list = list.next;
		list.next = new ListNode(2);
		list = list.next;
		list.next = new ListNode(3);
		list = list.next;
		list.next = new ListNode(3);
		list = list.next;
		list.next = new ListNode(4);
		list = list.next;
		list.next = new ListNode(4);
		list = list.next;
		list.next = new ListNode(5);
		
		System.out.println(deleteDuplicates(start.next));
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
        
		while(head != null){
        	
        }
		
		return head;
    }
}
