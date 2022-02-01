import java.util.LinkedList;
    
public class LeetCode21MergeSortedLinkedList {
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
    	
    	 ListNode temp = new ListNode(0);
         ListNode res = temp;
         
         while (l1 != null && l2 != null)
         {
             if (l1.val <= l2.val)
             {
                 temp.next = l1;
                 l1 = l1.next;
                 temp = temp.next;
             }
             else
             {
                 temp.next = l2;
                 l2 = l2.next;
                 temp = temp.next;
             }
         }
         if (l1 == null)
         {
             temp.next = l2;
         }
         else if (l2 == null)
         {
             temp.next = l1;
         }
         
         return res.next;
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   	 ListNode l1 = new ListNode(1);
   	 l1.next = new ListNode(2);
   	 l1.next.next = new ListNode(4);
   	 
   	 ListNode l2 = new ListNode(1);
   	 l2.next = new ListNode(3);
   	 l2.next.next = new ListNode(4);
   	 
   	 ListNode l3 = new ListNode(5);
   	 l3 = new ListNode(4, l3);
   	 l3 = new ListNode(1, l3);
   	 
   	 
   	 ListNode l4 = mergeTwoLists(l1, l2);
   	 
   	 System.out.println("hello");
	}

}
