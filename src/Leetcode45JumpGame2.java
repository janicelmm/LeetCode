import java.util.HashMap;

public class Leetcode45JumpGame2 {
    public static int jump(int[] nums) {
        
    	int end = 0;
    	int farthest = 0;
    	int count = 0;
    	
    	for (int i = 0; i < nums.length ; i++)
    	{
    		farthest = Math.max(farthest, i + nums[i]);
    		if(i == end)
    		{
    			count++;
    			end = farthest;
    		}
    	}
    	return count - 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jump(new int[] {2,3,1,1,4}));
	}

}
