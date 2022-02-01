import java.util.HashMap;

public class sandbox {

	public static boolean search(int[] nums, int target)
	{
		HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        
        if ((nums.length ==1) && target == nums[0])
        {
            return true;
        }
        
        for (int i = 0; i < nums.length; i++)
        {
            if (!temp.containsKey(target))
            {
                temp.put(nums[i], i);
            }  
        }
        
        boolean result = temp.get(target) == null;
        return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(search(new int[] {1,2,3}, 4));
	}

}
