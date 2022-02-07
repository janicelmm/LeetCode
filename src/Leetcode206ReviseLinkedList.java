public class Leetcode206ReviseLinkedList {
	
	public static ListNode reverseList(ListNode head) {
		
        ListNode prev = null;
        
        while (head != null)
        {
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        
        return prev;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
		System.out.println(reverseList(l1));
	}

}
