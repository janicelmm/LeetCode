import java.util.HashSet;

public class Leetcode287FindTheDuplicateNumber {
	public static int findDuplicate(int[] nums) {
        int i = 0; 
        int j = nums.length - 1;
        HashSet<Integer> track = new HashSet<>();
        
        while (i <= j)
        {
            if (track.contains(nums[i]))
            {
                return nums[i];
            }
            track.add(nums[i]);
            
            if (track.contains(nums[j]))
            {
                return nums[j];
            }
            
            track.add(nums[j]);
            
            i++;
            j--;
        }
        
        return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findDuplicate(new int[] {1,1}));
	}

}
