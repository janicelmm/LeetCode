
public class leetcode213HouseRobber2 {
    public static int rob(int[] nums) {
        if (nums.length == 1)
        {
            return nums[0];
        }

        int sum = 0;
        int prevSum = 0;
        int prev2Sum = 0;
        
        for (int i = 0; i < nums.length - 1; i++)
        {
            sum = Math.max(nums[i] + prev2Sum, prevSum);
            prev2Sum = prevSum;
            prevSum = sum;
        }
        
        int sum2 = 0;
        prevSum = 0;
        prev2Sum = 0;
        
        for (int i = 1; i < nums.length; i++)
        {
            sum2 = Math.max(nums[i] + prev2Sum, prevSum);
            prev2Sum = prevSum;
            prevSum = sum2;
        }
        
        return sum >= sum2 ? sum : sum2;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rob(new int[] {2,3,2}));
	}

}
