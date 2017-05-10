package _2_24_swap_node_pair;

public class Solution_1 {

	public static void main(String[] args) {
		

		ListNode start = new ListNode(0);
		ListNode list = start;
		
		list.next = new ListNode(1);
		list = list.next;		
		list.next = new ListNode(2);
		
		ListNode result = swapPairs(start.next);
		System.out.println(result);
		
	}
	
	public static ListNode swapPairs(ListNode head) {
		ListNode t1 = head;
        ListNode t2 = head;
        
        if(t1 != null && t1.next != null){
            t2 = t1.next;
        }else{
            return head;
        }
        
        while(t1 != null && t2 != null){
            int temp1 = t1.val;
            int temp2 = t2.val;
            t1.val = temp2;
            t2.val = temp1;
            if(t2.next != null && t2.next.next != null){
                t1 = t1.next.next;
                t2 = t2.next.next;
            }else{
                return head;
            }
        }
        
        return head;
    }

}
