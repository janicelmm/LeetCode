
public class Leetcode189RotateArray {
	
	public static int[] rotate(int[] nums, int k) {
		
		int idxOfLast = nums.length - k - 1;
		int lastNum = nums[idxOfLast];
		
		int pos = 0;
		
		for (int i = idxOfLast + 1; i < nums.length; i++)
		{
			nums[pos] = nums[i];
			pos++;
		}
		
		for (int i = 0; i < idxOfLast; i++)
		{
			nums[pos] = nums[i];
			pos++;
		}
		
		nums[nums.length - 1] = lastNum;
		
		return nums;
		
	}
	
	// o(n) runtime, o(n) space
    public static int[] rotateLargeSpace(int[] nums, int k) {
    	
    	int[] res = new int[nums.length];
    	
        for (int i = 0; i < nums.length; i++)
        {
        	res[(i+k)% nums.length]= nums[i];
        }

        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotate(new int[] {1,2,3,4,5,6}, 3));
	}

}
