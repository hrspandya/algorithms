package _2_21_merge_two_sorted_array;

public class Solution_1 {

	public static void main(String[] args) {
	
		ListNode start = new ListNode(0);
		ListNode list = start;
		
		list.next = new ListNode(1);
		list = list.next;		
		list.next = new ListNode(3);
		
		
		ListNode start2 = new ListNode(-1);
		ListNode list2 = start2;
		
		list2.next = new ListNode(2);
		list2 = list2.next;		
		list2.next = new ListNode(4);
		
		
		
		
		ListNode result = mergeTwoLists(start.next, start2.next);
		System.out.println(result);
		
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode head = list;
        
        if(l1 == null){
            head.next = l1;   
        }else{
            head.next = l2;
        }
        
        if(l1 == null && l2 == null){
            return null;
        }
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            }else{
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }
        
        while(l1 != null){
            head.next = l1;
            head = head.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            head.next = l2;
            head = head.next;
            l2 = l2.next;
        }
        
        return list.next;       
    }

}
