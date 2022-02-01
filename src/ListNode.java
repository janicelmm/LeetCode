
public class ListNode {

	public int val;
	public ListNode next;
	public ListNode() {}
	public ListNode(int val) { this.val = val; }
	public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
	public ListNode(int[] arr)
	{
		ListNode temp = new ListNode(0);
		ListNode itr = temp;

		for (int i = 0; i < arr.length; i++) 
		{
			itr.next = new ListNode(arr[i]);
			itr = itr.next;
		}
		
		this.val = temp.next.val;
		this.next = temp.next.next;
	}

	public static void print(ListNode node)
	{
		if (node == null)
		{
			System.out.println();
			return;
		}
		
		System.out.print(node.val + " ");
		print(node.next);
	}
}