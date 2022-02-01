
public class Leetcode1721SwapNodes {
	public static ListNode swapNodes(ListNode head, int k) {
        
        ListNode[] left = new ListNode[1];
        int[] num = new int[2];
        left[0] = head;
        num[0] = k;
        num[1] = 1;

        swap(head, left, num);
        
        return head;
        
    }
    
    public static void swap(ListNode right, ListNode[] left, int[] num)
    {
        if (right.next == null)
        {
            return;
        }
        num[1]++;
        
        swap(right.next, left, num);

        if (left[0] == right)
        {
        	ListNode temp = right;
        	ListNode temp2 = temp.next;
        	temp2.next = temp;
        	temp.next = null;
        }
        else
        {
        	num[0]--;
        	
        	if (num[0] == 1)
        	{
        		ListNode swap = left[0].next;
        		ListNode swapnext = swap.next;
        		ListNode rightend = right.next;
        		left[0].next = right;
        		if (swapnext == right)
        		{
        			right.next = swap;            	
        		}
        		else
        		{
        			right.next = swapnext; 
        			while (swapnext.next != right)
        			{
        				swapnext = swapnext.next;
        			}
        			swapnext.next = swap;
        		}
        		swap.next = rightend;
        	}
        	
        	left[0] = left[0].next;
        }
    }
    
    public static ListNode swapNodes2(ListNode head, int k) {
    	ListNode left = head;
    	ListNode right = head;
    	ListNode leftp = new ListNode(-1, left);
    	ListNode rightp = new ListNode(-1, right);
    	
    	int count = 0;
    	while (count != k -1)
    	{
    		right = right.next;
    		rightp = rightp.next;
    		count++;
    	}
    	
    	while (right.next != null)
    	{
    		right = right.next;
    		left = left.next;
    		leftp = leftp.next;
    	}
    	
    	right = rightp.next;

    	int leftv = left.val;
    	left.val = right.val;
    	right.val = leftv;
   	
   	 
   	 
    	
//    	 if(right != leftp)
//    	 {
//    		 ListNode leftnext = left.next;
//    		 rightp.next = left;
//    		 left.next = right.next;
//    		 leftp.next = right;
//    		 right.next = leftnext;
//    	 }
//    	 else
//    	 {
//    		 ListNode leftnext = left.next;
//    		 rightp.next = left;
//    		 left.next = right;
//    		 right.next = leftnext;
//    	 }
    	 
    	return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2};
		ListNode l1 = new ListNode(data);
		ListNode.print(l1);
		swapNodes2(l1, 1);
		ListNode.print(l1);
		//7,9,6,6,7,8,3,0,9,5
	}

}
