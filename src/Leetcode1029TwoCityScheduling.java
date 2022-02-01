import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class Leetcode1029TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int minCost = 0;
        int[] diff = new int[costs.length];
            
        for (int i = 0; i < costs.length; i++)
        {
            diff[i] = costs[i][1] - costs[i][0];
            minCost += costs[i][0];
        }
        
        Arrays.sort(diff);
        for (int k = 0; k < diff.length/2; k++)
        {
            minCost += diff[k];
        }
        
        return minCost;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
