public class LeetCode143RorderList {

	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

	public static void reorderList(ListNode head) {
		
        ListNode res = head;
        
        int count = count(head);
        ListNode temp = split(head, count);
        ListNode rev = findRev(temp);
        
        while (res != null && rev !=null)
        {
        	ListNode temp2 = res.next;
        	res.next = rev;
        	res = temp2;
        	if (res != null)
        	{
        		ListNode temp3 = rev.next;
        		rev.next = res;
        		rev = temp3;        		
        	}
        }
    }
	
	public static void reorderList2(ListNode head) {
		ListNode[] left = new ListNode[1];
		left[0] = head;
		
		reorder(left, head);
    }
	
	public static void reorder(ListNode[] left, ListNode right)
	{
		if (right == null)
		{
			return;
		}
		
		reorder(left, right.next);
		
		if(left[0].next != null)
		{
			ListNode leftnext = left[0].next;
			left[0].next = right;
			right.next = leftnext;
			left[0] = leftnext;
		}
		
		if(left[0].next == right)
		{
			left[0].next = null;
		}
		
	}
	
	public static int count(ListNode head)
	{
		int count = 0;
		while (head != null)
        {
            count++;
            head = head.next;
        }
		return count;
	}
	
	public static ListNode split(ListNode head, int count)
	{
		ListNode rev =  null;
        if (head.next != null)
        {
            rev = head;
        }

        for (int i = 1; i <= count/2; i++)
        {
            if (i == count/2)
            {
                rev = head.next;
                head.next = null;
            }
            head = head.next;
        }
        return rev;
	}
	
	
	public static ListNode findRev(ListNode temp)
	{
		if (temp == null || temp.next == null)
		{
			return temp;
		}
		
		ListNode newNode = findRev(temp.next);
		temp.next.next = temp;
		temp.next = null;
		
		return newNode;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
//		l1 = new ListNode(1);
		reorderList2(l1);
		System.out.println(l1);
	}

}
