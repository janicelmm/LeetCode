import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode119PascalTriangle2 {
	public static List<Integer> getRow(int rowIndex) {
	       List<Integer> pre = new LinkedList<Integer>();
	        
	        for (int i = 0; i <= rowIndex; i++)
	        {
	            List<Integer> curr = new LinkedList<Integer>();
	            for(int j = 0; j <= i; j++)
	            {
	                if (j == 0 || j == i)
	                {
	                    curr.add(1);
	                }
	                else
	                {
	                    curr.add(pre.get(j-1) + pre.get(j));
	                }
	            }
	            pre = curr;
	        }
	        return pre;
	    }
	
	public static List<Integer> getRow2(int rowIndex) {
		List<Integer> ans = new ArrayList<Integer>();
		
		for (int i = 0; i <= rowIndex; i++)
		{
			ans.add(1);
			for (int j = i -1 ; j > 0; j--)
			{
				ans.set(j, ans.get(j-1) + ans.get(j));
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow2(3));
	}

}
