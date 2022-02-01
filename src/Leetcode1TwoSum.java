import java.util.HashMap;
//
//public class Leetcode1 {
//	
//	public static int[] twoSum(int[] nums, int target) {
//		HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
//		int[] result = new int[2];
//        for (int a = 0; a < nums.length; a++)
//        {
//            if (store.containsKey(target - nums[a]))
//            {
//                result[0] = store.get(target - nums[a]);
//                result[1] = a;
//                
//                break;
//            }
//            else
//            {
//            	store.put(nums[a], a);
//            }           
//        }
//        
//        return result;
//	}
//	
//	public static void main(String[] args) {
//		int[] nums = new int[] {3,2,4};
//		System.out.println(twoSum(nums, 6));
//	}
//	
//	
//}

public class Leetcode1TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        
        for (int i = 0; i < list.length; i++)
        {
            if (!temp.containsKey(sum - list[i]))
            {
                temp.put(list[i], i);
            }
            else
            {
            	result = new int[] {temp.get(sum - list[i]), i};
            }
        }
        
        return result[0] == result[1] ? null : result;
        
    }
    
    public static int[] findTwoSum2(int[] list, int sum) {
    	//return null if no pairs found
        HashMap<Integer, Integer> remaining = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        
        for (int i = 0; i < list.length; i++)
        {
        	if (!remaining.containsKey(sum - list[i]))
        	{
        		remaining.put(list[i], i);
        	}
        	else
        	{
        		result[0] = i;
        		result[1] = remaining.get(sum - list[i]);
        	}
        }
        
        if (result[0] == 0 && result[1] == 0)
        {
        	return null;
        }
        else
        {
        	return result;
        }
      }

    public static void main(String[] args) {
    	int[] test = null;
    	
        int[] indices = findTwoSum2(new int[] {2,7,11,15}, 11);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
        System.out.println(findTwoSum2(new int[]{2,7,11,15}, 11));
    }
}