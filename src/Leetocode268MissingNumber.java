import java.util.Arrays;

public class Leetocode268MissingNumber {
    public static int missingNumber(int[] nums) {
        
        for(int i = 1; i <= nums.length; i++)
        {
            int count = 0;
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[j] == i)
                {
                    count++;
                    break;
                }
            }
            if (count == 0)
            {
                return i;
            }
        }
        return 0;
    }
    
    public static int missingNumber2(int[] nums) {
        
    	Arrays.sort(nums);
    	int missing = 1;
    	
        for(int i = 1; i < nums.length; i++)
        {
            if (nums[i] != missing)
            {
            	return missing;
            }
            missing++;
        }
        return missing;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber2(new int[] {3, 4, 8, 5, 0, 1, 2, 6, 9}));
	}

}
