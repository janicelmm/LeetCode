
public class Leetcode377combinationSumIV {
    public static int combinationSum4(int[] nums, int target) {
        int[] count = new int[target + 1];
        count[0] = 1;
        
        for (int i = 1; i < count.length; i++)
        {
            for (int n : nums)
            {
                if (i >= n)
                {
                    count[i] += count[i-n];    
                }
                
            }
        }
        return count[target];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(combinationSum4(new int[] {1,2,3}, 4));
	}

}
