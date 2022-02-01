
public class Leetcode1664WaysToMakeFairArray {

    public static int waysToMakeFair(int[] nums) {
        int ans = 0;
        int[] left = new int[2];
        int[] right = new int[2];
        
        for (int i = 0; i < nums.length; i++)
        {
        	right[i%2] += nums[i];
        }
        
        for (int j = 0; j < nums.length; j++)
        {
        	right[j%2] -= nums[j];
        	
        	if (right[0] + left[1] == right[1] + left[0])
        	{
        		ans++;
        	}
        	
        	left[j%2] += nums[j];
        }
        
        return ans;
            
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(waysToMakeFair(new int[] {2,1,6,4}));
	}

}
