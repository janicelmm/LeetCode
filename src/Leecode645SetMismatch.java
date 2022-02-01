import java.util.Arrays;

public class Leecode645SetMismatch {
    public static int[] findErrorNums(int[] nums) {
    	int count = 0;
    	int dup = 0;
    	int missing = 0;
    	
    	for(int i = 1; i <= nums.length; i++)
    	{ 
    		count = 0;
    		for (int j = 0; j < nums.length; j++) 
    		{
    			if (nums[j] == i)
    			{
    				count++;
    			}
    		}
    		if (count == 2)
    		{
    			dup = i;
    		}
    		if (count == 0)
    		{
    			missing = i;
    		}
    	}
    	return new int[] {dup, missing};
    }
    
    public static int[] findErrorNums2(int[] nums) {
        int dup = -1, missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i)
                    count++;
            }
            if (count == 2)
                dup = i;
            else if (count == 0)
                missing = i;
        }
        return new int[] {dup, missing};
    }
    
    public static int[] findErrorNums3(int[] nums) {
        Arrays.sort(nums);
        int dup = -1, missing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                dup = nums[i];
            else if (nums[i] > nums[i - 1] + 1)
                missing = nums[i - 1] + 1;
        }
        return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findErrorNums(new int[] {2,3,3,4,5,6}));
	}

}
//[1,2,2,4]
//[2,2]
//[2,3,3,4,5,6]