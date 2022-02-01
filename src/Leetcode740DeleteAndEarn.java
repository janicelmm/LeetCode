import java.util.HashMap;
import java.util.HashSet;

public class Leetcode740DeleteAndEarn {

	public static int deleteAndEarn(int[] nums) {
		
		if (nums.length == 1)
			return nums[0];
		
		int[] count = new int[10000];
		int max = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
			max = Math.max(max, nums[i]);
			count[nums[i]]++;
		}
		
		int[] ans = new int[max +1];
		ans[1] = count[1];
		
		for (int k = 2; k < ans.length; k++) 
		{
			ans[k] = Math.max(count[k]*k + ans[k-2], ans[k-1]);
		}
		
		return ans[max];
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deleteAndEarn(new int[] {8,7,3,8,1,4,10,10,10,2}));
	}
	//2,2,3,3,3,4
	//8,7,3,8,1,4,10,10,10,2
	//3,3,3,4,2
}
