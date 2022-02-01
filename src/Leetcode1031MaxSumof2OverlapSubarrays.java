
public class Leetcode1031MaxSumof2OverlapSubarrays {
	public static int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        for (int i = 1; i < nums.length; i++)
        {
            nums[i] += nums[i-1];
        }
        
        int Lmax = nums[firstLen - 1];
        int Rmax = nums[secondLen - 1];
        int res = nums[firstLen + secondLen - 1];
        
        for (int j = firstLen + secondLen; j < nums.length; j++)
        {
        	Lmax = Math.max(Lmax, nums[j - secondLen] - nums[j - secondLen- firstLen]);
        	Rmax = Math.max(Rmax, nums[j - firstLen] - nums[j - firstLen - secondLen]);
        	int LmaxTotal = Lmax + nums[j] - nums[j-secondLen];
        	int RmaxTotal = Rmax + nums[j] - nums[j-firstLen];
        	res = Math.max(res,  Math.max(LmaxTotal, RmaxTotal));
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSumTwoNoOverlap(new int[] {1,0,3}, 1,2));
	}

}
