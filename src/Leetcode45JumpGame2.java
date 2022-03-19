import java.util.Arrays;

public class Leetcode45JumpGame2 {
    public static int jump(int[] nums) {
        
    	int end = 0;
    	int farthest = 0;
    	int count = 0;
    	
    	for (int i = 0; i < nums.length - 1; i++)
    	{
    		farthest = Math.max(farthest, i + nums[i]);
    		if(i == end)
    		{
    			count++;
    			end = farthest;
    		}
    	}
    	return count;

    }
    
    public static int jump2(int[] nums) {
        
        int farthest = 0;
        int[] max = new int[nums.length];
        Arrays.fill(max, nums.length);
        max[0] = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            farthest = nums[i] + i;
            for (int j = i+1; j <= farthest && j < nums.length; j++)
            {
                max[j] = Math.min(max[i]+ 1, max[j]);
            }
        }
        
        return max[nums.length - 1];
    }
    
	public static void main(String[] args) {
		System.out.println(jump2(new int[] {1,2,1,0,1}));
		//2,3,1,1,4
		//7,0,9,6,9,6,1,7,9,0,1,2,9,0,3
	}
}
