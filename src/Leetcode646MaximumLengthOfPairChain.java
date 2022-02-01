import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode646MaximumLengthOfPairChain {
    public static int findLongestChain(int[][] pairs) {
    	Arrays.sort(pairs, (a,b) -> Integer.compare(a[0], b[0]));
		int end = pairs[0][1];
		int count = 1;
		
		for (int i = 1; i < pairs.length; i++)
		{
			if (pairs[i][0] > end)
			{
				end = pairs[i][1];
				count++;
			}
			else
			{
				end = Math.min(end, pairs[i][1]);			
			}
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
