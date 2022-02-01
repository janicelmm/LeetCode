import javax.xml.transform.sax.TemplatesHandler;

public class Leetcode300 {
	public static int lengthOfLIS(int[] nums) {
	     
        int max = 0;
        int count = 1;
        int min = -10000;
        
        for (int i = 0; i < nums.length-1; i++)
        {
        	min = nums[i];
        	
            for (int j = 0; j < nums.length -1; j++)
            {   
                
                if ((i < j) && (nums[j] > min))
                {
                    count++;
                    min = nums[j];
                }
                
            }
      
            max = Math.max(max, count);
            count = 1;
            
        }
        
        return max;
    }
	
	public static int lengthOfLIS2(int[] nums) {
	     	
		int[] temp = new int[nums.length];
		int i = 1;
		int max = 0;
		
		for(int a = 0; a < nums.length; a++)
		{
			temp[a] = 1;
		}
		
		while (i < nums.length)
		{
			int j = 0;
			while (j < i)
			{
				if (nums[j] < nums[i])
				{
					temp[i] = Math.max(temp[i], temp[j]+1);
					max = Math.max(max, temp[i]);
				}
				j++;
			}
			i++;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLIS2(new int[] {10,9,2,5,3,7,101,18}));
	}

}
