
public class Leetcode203RemoveLinkedListElement {
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

    public static ListNode removeElements(ListNode head, int val) {
        
        if (head == null)
        {
            return null;
        }
        
        while (head != null && head.val == val)
        {
        	head = head.next;
        }

        ListNode res = head;
        
        while (head != null && head.next != null)
        {
            if (head.next.val == val)
            {
               head.next = head.next.next;
            }
            else
            {
               head = head.next;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(6);
		l1 = new ListNode(6, l1);
		l1 = new ListNode(6, l1);
		l1 = new ListNode(6, l1);
		l1 = new ListNode(6, l1);
//		l1 = new ListNode(2, l1);
//		l1 = new ListNode(1, l1);
	
//		l1 = new ListNode(5, l1);
//		l1 = new ListNode(4, l1);
//		l1 = new ListNode(3, l1);
//		l1 = new ListNode(6, l1);
//		l1 = new ListNode(2, l1);
//		l1 = new ListNode(1, l1);
		System.out.println(removeElements(l1, 6));
	}
}
//1,2,6,3,4,5,6