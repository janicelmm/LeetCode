
public class Leetcode2095RemoveMiddleNode {

	public ListNode deleteMiddle(ListNode head) {
        
        if (head == null || head.next == null)
        {
            return null;
        }
        
        int count = count(head);
        ListNode l1 = head;
        
        for(int i = 0; i < count/2; i++)
        {
            if (i == count/2 - 1)
            {
                l1.next = l1.next.next;
            }
            l1 = l1.next;
        }
        return head;
    }
    
	public static void deleteMiddle2(ListNode head) {
        if (head == null || head.next == null)
        {
        	return;
        }
        
        ListNode[] left = new ListNode[1];
        left[0] = head;
        
        remove(left, head);
        
    }
	
	public static void remove(ListNode[] left, ListNode right)
	{
		if (right == null)
		{
			return;
		}
		
		remove(left, right.next);
			
		if (left[0] != null && left[0].next == right)
		{
			left[0].next = right.next;
		}
		
		if (left[0] != null && left[0].next != null && left[0].next.next == right)
		{
			left[0].next = right;
		}
		
		if (left[0].next != null)
		{
			left[0] = left[0].next;			
		}
		
	}
	
    public int count(ListNode head)
    {
        int count = 0;
        while (head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {1, 2, 3, 4, 5};
		ListNode l1 = new ListNode(data);
		ListNode.print(l1);
		deleteMiddle2(l1);
		ListNode.print(l1);
	}

}
