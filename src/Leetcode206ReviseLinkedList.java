public class Leetcode206ReviseLinkedList {
	
	public static ListNode reverseList(ListNode head) {
		
		if(head == null || head.next == null)
		{
			return head;
		}
		
		ListNode newL = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		
		return newL;

	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
		System.out.println(reverseList(l1));
	}

}
