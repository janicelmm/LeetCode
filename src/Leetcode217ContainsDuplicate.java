import java.util.HashSet;
import java.util.Set;

public class Leetcode217ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<Integer>();
        
        for(int a = 0; a < nums.length; a++)
        {
        	if(store.contains(nums[a]))
        	{
        		return true;
        	}
        	
            store.add(nums[a]);
        }
        
        return false;
    }
	
	public static boolean containsDuplicate2(int[] nums) {
		HashSet<Integer> temp = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++)
		{
			temp.add(nums[i]);
		}
		
		return nums.length != temp.size();
    }
	
	public static void main(String[] args) {
		System.out.println(containsDuplicate2(new int[] {1,2,3, 1, 1}));
	}

}
