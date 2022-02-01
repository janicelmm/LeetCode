
public class Leetcode238ProductExceptSelf {

	public static int[] productExceptSelf2(int[] nums) {

		int[] result = new int[nums.length];
        result[0] = 1;
        int right = 1;
        
        for (int a = 1; a < nums.length; a++)
        {
            result[a] = result[a-1]*nums[a-1];
        }
        
        for (int b = nums.length-2; b >=0 ; b--)
        {
            right *=nums[b+1];
            result[b] *= right; 
        }
        
        return result;
        
    }
	//long way
	public static int[] productExceptSelf3(int[] nums) {

		int[] result = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++)
		{
			int product = 1;
			
			for (int j = 0; j < nums.length; j++)
			{
				if (i != j)
				{
					product *= nums[j];
				}
			}
			result[i] = product;
		}
		return result;
    }
	
	//long way
	public static int[] productExceptSelf4(int[] nums) {
   
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		int[] result = new int[nums.length];
		right[nums.length - 1] = 1;
		left[0] = 1;
    
		//right
		for (int i = nums.length - 2; i >=0 ; i--)
		{
			right[i] = right[i+1] * nums[i+1];
        
		}
        
		//left
		for (int j = 1; j <nums.length; j++)
		{
			left[j] = left[j-1] * nums[j-1];
        
		}
    
		//product
		for (int a = 0; a <nums.length; a++)
		{
			result[a] = left[a] * right[a];        	
		}
    
		return result;
        
    }
	

	public static void main(String[] args) {
		System.out.println(productExceptSelf4(new int[]{1,2,3,4}));
	}

}
