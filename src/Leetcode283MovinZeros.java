
public class Leetcode283MovinZeros {
	public static int[] moveZeroes(int[] nums) {
               
		for (int i = 0, j = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                j++;
            }
        }
		return nums;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(moveZeroes(new int[] {0,1,0,3,12}));
	}

}
