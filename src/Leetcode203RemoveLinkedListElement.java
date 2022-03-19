
public class Leetcode203RemoveLinkedListElement {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) 
        {
            this.val = val;
        }

        ListNode(int val, ListNode next) 
        {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) 
        {
            return head;
        }

        ListNode l2 = head;

        while (head.next != null) 
        {
            if (head.next.val == val) 
            {
                head.next = head.next.next;
            } else 
            {
                head = head.next;
            }
        }

        return l2.val == val ? l2.next : l2;
    }

    public static void main(String[] args) {
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