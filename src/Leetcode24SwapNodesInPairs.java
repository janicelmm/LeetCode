
public class Leetcode24SwapNodesInPairs {
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

	 public static ListNode swapPairs(ListNode head) {
	      
		 if (head == null)
			 return null;
		 if(head.next == null)
			 return head;
		 
		 
		 ListNode temp = head;
		 head = head.next;
		 temp.next = swapPairs(head.next);
		 head.next = temp;
		 
		 return head;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
		System.out.println(swapPairs(l1));
	}

}
