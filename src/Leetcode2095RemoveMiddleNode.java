
public class Leetcode2095RemoveMiddleNode {
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) 
        {
            return null;
        }

        int count = 0;
        ListNode l2 = head;
        
        while (l2 != null) 
        {
            count++;
            l2 = l2.next;
        }

        count = count / 2;
        ListNode l3 = head;
        
        for (int i = 0; i < count; i++) 
        {
            if (i == count - 1) 
            {
                l3.next = l3.next.next;
            } 
            else 
            {
                l3 = l3.next;
            }
        }

        return head;
    }

    public static ListNode deleteMiddle2(ListNode head) {
        if (head == null || head.next == null) 
        {
            return null;
        }

        ListNode prev = new ListNode(1001, head);
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) 
        {
            prev = prev.next;
            fast = fast.next.next;
            slow = slow.next;
        }
        
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5 };
        ListNode l1 = new ListNode(data);
        ListNode.print(l1);
        deleteMiddle2(l1);
        ListNode.print(l1);
    }
}
