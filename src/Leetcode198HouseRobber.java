import java.util.HashMap;

public class Leetcode198HouseRobber {

    public static int rob(int[] nums) {
        
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        int prevSum = 0;
        int prev2Sum = 0;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            sum = Math.max(nums[i] + prev2Sum, prevSum);
            prev2Sum = prevSum;
            prevSum = sum;
                
        }
        
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rob(new int[] {155,44,52,58,250,225,109,118,211,73,137,96,137,89,174,66,134,26,25,205,239,85,146,73,55,6,122,196,128,50,61,230,94,208,46,243,105,81,157,89,205,78,249,203,238,239,217,212,241,242,157,79,133,66,36,165}));
		
	}

}
