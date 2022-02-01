import java.util.Arrays;

public class Leetcode1561MaxNoofCoinsYouCanGet {
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int count = 0;
        int max = piles.length/3;
        
        for (int i = piles.length -2; i >= 0; i= i-2)
        {
        	if (count < max)
        	{
                sum +=piles[i];
                count++;
        	}
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxCoins(new int[] {1,2,3,4,5,6,7,8,9}));
	}

}
