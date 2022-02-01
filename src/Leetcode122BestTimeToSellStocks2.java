
public class Leetcode122BestTimeToSellStocks2 {
	public static int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        int gain = 0;
        int prevGain = 0;
        
        if(prices.length == 1)
        {
            return 0;
        }
        
        for (int i = 1; i < prices.length; i++)
        {
        	gain = Math.max(gain, Math.max(0, prices[i] - min));
        	
            if (gain <= prevGain)
            {
                min = prices[i];
                ans += gain;
                prevGain = 0;
                gain = 0;
            }
            else
            {
                min = Math.min(min, prices[i]);    
            }
            
            prevGain = gain;
        }
        return ans + gain;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[] {5,4,3,2}));
	}
//6,1,3,2,4,7
}
