
public class Leetcode300 {
	public static int lengthOfLIS(int[] nums) {
	     
        int max = 1;
        int[] count = new int[nums.length];
        count[0] = 1;
        
        for (int i = 1; i < nums.length; i++)
        {
            for (int j = i-1; j >=0; j--)
            {
                if (nums[i] > nums[j])
                {
                    count[i] = Math.max(count[j] + 1, count[i]);
                }
                else
                {
                    count[i] = Math.max(count[i], 1);
                }
                
                max = Math.max(count[i], max);
            }                
        }
        
        return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
	}

}
