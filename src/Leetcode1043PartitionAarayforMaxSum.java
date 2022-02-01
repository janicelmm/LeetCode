public class Leetcode1043PartitionAarayforMaxSum {
	
    public static int maxSumAfterPartitioning(int[] arr, int k) {
       int[] maxSum = new int[arr.length];
       
       int max = 0;
       for (int i = 0; i < arr.length; i++)
       {
		   if (i >= k)
		   {
			   max = 0;
			   for (int j = 1; j <= k; j++)
			   {
				   max = Math.max(max,  arr[i-j+1]);
				   maxSum[i] = Math.max(maxSum[i], maxSum[i-j] + max*j);   
			   }
		   }
		   else
		   {
			   max = Math.max(max, arr[i]);
			   maxSum[i] = max*(i+1);	
   		   }
       }
       return maxSum[arr.length - 1];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSumAfterPartitioning(new int[] {1,15,7,9,2,5,10}, 3));
	}

}
