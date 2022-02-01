
public class Leetcode413ArithmetricSlices {
    public static int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3)
        {
            return 0;
        }
        
        int[] count = new int [nums.length];
        int diff = nums[1] - nums[0];
        int start = 0;
        int ans = 0;
        
        for (int i = 1; i < nums.length; i++)
        {
    		if (nums[i] - nums[i-1] != diff)
    		{
    			start = i;
    			ans += count[i-1];
    		}
    		
    		if (nums[i] - nums[i-1] == diff && i - start >= 2)
    		{
    			count[i] = (i - start - 1) + count[i - 1];
    		}
    		
    		diff = nums[i] - nums[i-1];
        }
        
        return ans + count[nums.length -1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfArithmeticSlices(new int[] {1,2,3,8,9,10}));
	}

}
