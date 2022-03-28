import java.util.Arrays;

public class Leetcode16ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int ans = 0;                  
        
        for (int k = 0; k < nums.length - 1; k++)
        {
            if (k != 0 && nums[k] ==nums[k-1])
            {
                continue;
            }
            
            int i = k+1; 
            int j = nums.length - 1; 
            
            while (i < j)
            {
                int sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(sum - target) < diff)
                {
                    diff = Math.abs(sum - target);
                    ans = sum;
                }

                if (sum == target)
                {
                    return target;
                }
                else if (sum > target)
                {
                    j--;
                }
                else
                {
                    i++;
                }
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[] {-1,2,1,-4}, 1));
    }
}
