import java.util.HashMap;

public class Leetcode219ContainsDuplicatesII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> dup = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            if (dup.containsKey(nums[i]) && (i - dup.get(nums[i])) <= k)
            {
                return true;
            }
            else
            {
                dup.put(nums[i], i);
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}
