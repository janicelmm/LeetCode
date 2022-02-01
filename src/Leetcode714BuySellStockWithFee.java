
public class Leetcode714BuySellStockWithFee {
    public static int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];
        
        for(int i = 1; i < prices.length; i++)
        {
            cash = Math.max(cash, prices[i] + hold - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        
        return cash;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[] {1,3,2,8,4,9}, 2));
	}

}
