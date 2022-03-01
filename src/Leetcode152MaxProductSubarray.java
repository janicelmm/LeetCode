
public class Leetcode152MaxProductSubarray {
    public static int maxProduct(int[] nums) 
    {
        
        int min = nums[0];
        int max = nums[0];
        int temp = nums[0];
        
        for (int i = 1; i < nums.length; i++)
        {
            int prevMax = max;
            max = Math.max(Math.max(nums[i] * max, nums[i]* min), nums[i]);
            min = Math.min(Math.min(nums[i] * prevMax, nums[i]* min), nums[i]);
            temp = Math.max(max,  temp);
        }
        
        return temp;

    }
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {-4,-3,-2}));
    }

}
