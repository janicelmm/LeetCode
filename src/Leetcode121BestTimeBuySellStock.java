import java.util.HashMap;

public class Leetcode121BestTimeBuySellStock {
	public static int maxProfit(int[] prices) {
//		HashMap <Integer, Integer> store = new HashMap<Integer, Integer>();
//		int minprice = prices[0];
//		int maxprice = prices[0];
//		int minindex = 0;
//		int maxindex = 0;
//		int result = 0;
//		store.put(prices[0], 0);
//		
//		for (int a = 0; a < prices.length; a++)
//		{
//			
//			if ((prices[a] < minprice) && (a != (prices.length-1)))
//			{
//				minprice = prices[a];
//				maxprice = prices[a];
//				minindex = a;
//				maxindex = a;
//			}
//			if ((prices[a] > maxprice) && (a > minindex))
//			{
//				maxprice = prices[a];
//				maxindex = a;
//			}
//
//			if((minindex < maxindex) && (maxprice-minprice) > result)
//			{
//				result = maxprice- minprice;
//			}
//		}
//		
//		return result;
		/////////
		
        int max = 0;
        int min = prices[0];
        int diff = 0;
            
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < min)
            {
                min = prices[i];
                max = prices[i];
            }
            
            if (prices[i] > min)
            {
                max = prices[i];
                diff = Math.max(diff, prices[i] - min);
            }
        }
        return diff;
		
	} 
	
	public static int maxProfit2(int[] prices) {
        int buy = prices[0];
        int diff = 0;
        
        for (int i = 0; i < prices.length; i++)
        {
        	if (buy > prices[i])
        	{
        		buy = prices[i];
        	}
        	if (prices[i] > buy)
        	{
        		diff = Math.max(diff, prices[i] - buy);
        	}
        }
        
        return diff;
        
	} 
	
	public static void main(String[] args) {
		int[] prices = new int[] {7,6,4,3,1};
		System.out.println(maxProfit2(prices));
	}
}
