
public class Leetcode53 {
	public static int maxSubArray(int[] nums) {
        
	    if (nums.length == 1)
	    {
	        return nums[0];
	    }
        
        if (nums.length == 2)
	    {
	        if(nums[0] > 0 && nums[1] > 0)
            {
                return nums[0] + nums[1];
            }
            
            if (nums[0] < nums[1])
            {
                return nums[1];
            }
            else
            {
                return nums[0];
            }
	    }
	        
	    int prevSum = nums[0];
	    int max = nums[0];
	    //nums[0] = nums[0] < 0 ? 0 : nums[0];

	    for (int i = 1; i < nums.length; i++)
	    {            
	        if (prevSum + nums[i] > 0)
	        {
	        	prevSum = prevSum + nums[i];
	            nums[i] = prevSum;
		        max = Math.max(max, prevSum);
	        }
	        
	        if (prevSum + nums[i] < 0)
	        {
	        	
	            prevSum = 0;
	            nums[i] = prevSum;
		        max = Math.max(max, prevSum);
	        }
	        if (prevSum + nums[i] == 0)
	        {
	        	prevSum = Math.max(prevSum + nums[i], nums[i]);
	        	nums[i] = Math.max(prevSum, nums[i]);
		        max = Math.max(max, prevSum);
	        }
	    }
	    
	    return max;
	         
	    }
	
	public static int maxSubArray2(int[] nums) {
        if (nums == null || nums.length == 0)
        {
            return 0;
        }
        
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        
        for (int i = 1; i < nums.length; i++)
        {
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;

	}

	public static int maxSubArray3(int[] nums) {
		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		int max = nums[0];
		
		for (int i = 1; i < nums.length; i++)
		{
			sum[i] = Math.max(sum[i-1] + nums[i], nums[i]);
			max = Math.max(max, sum[i]);
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(maxSubArray3(new int[] {5,4,-1,7,8}));
	
	//-2,1,-3,4,-1,2,1,-5,4
	//-1, 0, -2
	//-2,-1
	//-1,-2,-3,0
	//-1,1,2,1
	//-2,-3,-1
	
//    int max = Integer.MIN_VALUE, sum = 0;
//    for (int i = 0; i < A.length; i++) {
//        if (sum < 0) 
//            sum = A[i];
//        else 
//            sum += A[i];
//        if (sum > max)
//            max = sum;
//    }
//    return max;
	
	
	}

}
