
public class ListOfInt {
	
	private int value;
	private ListOfInt node;
	
	public ListOfInt(int x)
	{	
		value = x;
		node = null;
	}
	
	public void add(int x)
	{
		ListOfInt tempNode = node;
		
		while(tempNode != null)
		{
			tempNode = tempNode.node;
		}
		
		tempNode.node = new ListOfInt(x);
	}
	
	public void print()
	{
		ListOfInt tempNode = this;
		
		while(tempNode != null)
		{
			System.out.println(tempNode.value);
		}
	}

	public static void main(String[] args) {
		ListOfInt myList = new ListOfInt(1);
		myList.print();
		myList.add(2);
		myList.print();
		myList.add(3);
		myList.print();
		myList.add(4);
		myList.print();

	}

}
