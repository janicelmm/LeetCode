public class Leetcode322 {

    public static int coinChange(int[] coins, int amount) {
    	
    	if(amount == 0)
    	{
    		return 0;
    	}
    	 
    	if(coins.length == 1 && coins[0] > amount)
    	{
    		return -1;
    	}
    	
    	int[] allAmount = new int[amount + 1];
    	
    	for (int j = 1; j < allAmount.length; j++)
    	{
    		int min = j + 1;
    		
    		for (int coin : coins)
    		{
    			if (j >= coin && allAmount[j-coin] != -1)
    			{
    				int temp1 = 1 + allAmount[j - coin];
    				min = Math.min(min, temp1);
    			}
    		}
    		allAmount[j] = min;
    		
    		if (min == j + 1)
    		{
    			allAmount[j] = -1;
    		}
    	}
    	
    	return allAmount[amount];
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coinChange(new int[] {2}, 3));
	}

}
