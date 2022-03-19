/*
 * Arrays, DP question. Need to keep track of the maximum so far, and compare the sum of maximum + value and value itself if case of negative numbers.
 */

public class Leetcode53 {
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
    
        for (int i = 1; i < nums.length; i++) 
        {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(max, sum);
        }
    
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {5,4,-1,7,8}));
        // -2,1,-3,4,-1,2,1,-5,4
        // -1, 0, -2
        // -2,-1
        // -1,-2,-3,0
        // -1,1,2,1
        // -2,-3,-1
    }
}
