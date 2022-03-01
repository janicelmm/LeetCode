public class Leetcode485MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        
        for (int i : nums)
        {
            if (i == 1)
            {
                count++;
                max = Math.max(max, count);
            }
            else
            {
                count = 0;
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
    }
}
