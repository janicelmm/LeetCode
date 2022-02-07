import java.util.HashMap;

public class Leetcode75SortColors {
    public static int[] sortColors(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums)
        {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        for (int i = 0; i < nums.length; i++)
        {
            if (count.containsKey(0) && count.get(0) > 0)
            {
                nums[i] = 0;
                count.put(0, count.get(0) - 1);
            }
            else if (count.containsKey(1) && count.get(1) > 0)
            {
                nums[i] = 1;  
                count.put(1, count.get(1) - 1);
            }
            else
            {
                nums[i] = 2;   
                count.put(2, count.get(2) - 1);
            }
        }
        return nums;
    }
    
    public static int[] sortColors2(int[] nums) {
    	
    	if (nums == null || nums.length == 0)
    	{
    		return nums;
    	}
    	
        int p1 = 0;
        int p2 = nums.length - 1;
        int i = 0;
        
        while (i <= p2)
        {
        	if (nums[i] == 1)
        	{
        		i++;
        	}
        	else if (nums[i] == 2)
        	{
        		swap(nums, i, p2);
        		p2--;
        	}
        	else
        	{
        		swap(nums, i, p1);
        		p1++;
        		i++;
        	}
        }
        return nums;
        		
    }
    
    public static void swap(int[] nums, int i, int j)
    {
    	int temp = nums[i];
    	 nums[i] = nums[j];
    	 nums[j] = temp;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sortColors2(new int[] {1,2,0,2,0}));
	}

}
