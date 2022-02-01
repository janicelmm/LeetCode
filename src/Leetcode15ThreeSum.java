import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode15ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashSet<Integer> temp = new HashSet<Integer>();
        HashSet<List<Integer>> temp2= new HashSet<List<Integer>>();
        int remain = 0;
        
        if (nums == null || nums.length < 3)
        {
            return result;
        }
        
        for (int i = 0; i < nums.length; i++)
        {
            remain -= nums[i];
            
            for (int j = 0; j < nums.length; j++)
            {
                if (i != j) 
                {
                	if (!temp.contains(remain - nums[j]))
	                {
                		temp.add(nums[j]);
	                }
	                else 
	                {
	                	List<Integer> templist = Arrays.asList(nums[i], nums[j], remain - nums[j]);
	                	Collections.sort(templist);
	                	if (!temp2.contains(templist))
	                	{
	                		temp2.add(templist);
		                    result.add(templist);
		                    temp.remove(remain - nums[j]);
	                	}
	                }
                }
            }
            temp.clear();
            remain = 0;
        }
        return result;
    }
    public static List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        
        if ((nums.length < 3) || nums == null)
        {
            return new ArrayList<>(res);
        }
        
        for (int i = 0; i < nums.length-2; i++)
        {         
            int j = i+1;
            int k = nums.length - 1;
            while (j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0)
                {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if (sum > 0)
                {
                    k--;
                }
                else if (sum < 0)
                {
                    j++;
                }
            }
        }
        return new ArrayList<>(res);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(threeSum2(new int[] {3,0,-2,-1,1,2}));
	}

}
//[3,0,-2,-1,1,2]
