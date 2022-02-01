import java.util.Stack;

public class Leetcode234PalindromeLinkedList {

	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
        {
            return true;
        }
        
        Stack<Integer> s = new Stack<Integer>();
        ListNode temp = head;
        int count = 0;
        
        while (head != null)
        {
            count++;
            s.push(head.val);
            head = head.next;
        }

        count = count/2;
        
        while(count> 0)
        {
            if (temp.val != s.pop())
            {
                return false;
            }
            temp = temp.next;
            count--;
        }

       return true; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
		System.out.println(isPalindrome(l1));
	}

}
