import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test1 {
	
	List<Integer> numList = new ArrayList<Integer>();
	HashSet<Integer> set= new HashSet<Integer>();
	
	public void append(int[] a){
		
		int sum = 1; 
		int start = numList.size() - 2 >= 0 ? numList.size() - 2 : 0;
		
		for (int i : a)
		{
			numList.add(i);
		}
				
		for (int j = start; j < numList.size()-2; j++)
		{
			sum = numList.get(j) * numList.get(j+1) * numList.get(j+2);
			
			if (!set.contains(sum))
			{
				set.add(sum);
			}
		}
	}
	
	public boolean contains(int num){
		return set.contains(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 movingTotal = new Test1();
		
		movingTotal.append(new int[] {1,2,3,4});
		
		System.out.println(movingTotal.contains(6));
		System.out.println(movingTotal.contains(9));
		System.out.println(movingTotal.contains(12));
		System.out.println(movingTotal.contains(24));
		
		movingTotal.append(new int[] {5});
		
		System.out.println(movingTotal.contains(6));
		System.out.println(movingTotal.contains(9));
		System.out.println(movingTotal.contains(24));
		System.out.println(movingTotal.contains(60));
		
	}

}
