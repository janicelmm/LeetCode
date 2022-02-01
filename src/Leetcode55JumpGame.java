import java.util.LinkedList;
import java.util.Queue;

public class Leetcode55JumpGame {
    public boolean canJump(int[] nums) {
        
        if(nums == null || nums.length <= 0)
            return true;
        
        boolean[] visited = new boolean[nums.length];
        Queue<Integer> positions = new LinkedList<Integer>();
        
        positions.add(0);
        visited[0] = true;
        
        while (!positions.isEmpty())
        {
            int nextPos = positions.poll();
            
            if (nextPos + nums[nextPos] >= nums.length - 1)
                return true;
            
            for (int i = 1; i <= nums[nextPos]; i++)
            {   
                if (!visited[nextPos + i])
                {
                    positions.add(nextPos + i);
                    visited[nextPos + i] = true;
                }
            }
        }
        
        return false;
    }
    
    public static boolean canJump2(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++)
        {
        	if(i > max)
        	{
        		return false;
        	}
        	
        	max = Math.max(max, i+nums[i]);
        }
        return max >= nums.length -1;
    }
    
	public static void main(String[] args) {
		System.out.println(canJump2(new int[]{3,2,1,0,4}));

	}

}
