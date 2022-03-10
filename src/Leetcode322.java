/*
 * Use DP to find the min coins needed to from amount $0 to $amount. 
 * Need to loop through the coins array, and keep track of the min number of coins needed. 
 * Trick is to set the max value to be (amount + 1), as it's impossible to get greater than this value. 
 */

public class Leetcode322 {
    public static int coinChange(int[] coins, int amount) {
    
        if (amount == 0) 
        {
            return 0;
        }
    
        if (coins.length == 1 && coins[0] > amount) 
        {
            return -1;
        }
    
        int[] allAmount = new int[amount + 1];
    
        for (int j = 1; j < allAmount.length; j++) 
        {
            int min = j + 1;
    
            for (int coin : coins) 
            {
                if (j >= coin && allAmount[j - coin] != -1) 
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

    public static int coinChange2(int[] coins, int amount) {

        if (amount == 0) 
        {
            return 0;
        }

        int[] track = new int[amount + 1];

        for (int j = 1; j < track.length; j++) 
        {
            track[j] = amount + 1;

            for (int c : coins) 
            {
                if (j >= c) 
                {
                    track[j] = Math.min(1 + track[j - c], track[j]);
                }
            }
        }

        if (track[amount] < amount + 1) 
        {
            return track[amount];
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(coinChange2(new int[] {186,419,83,408}, 6249));
    }
}
