import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode56MergeIntervals {
	public static int[][] merge(int[][] intervals) {
		
		if (intervals.length <=1)
		{
			return intervals;
		}
		
		Comparator<Integer[]> com = (a, b) -> a[0].compareTo(b[0]);
		Queue<Integer[]> sorted = new PriorityQueue<Integer[]>(com);
		
		for (int i = 0; i < intervals.length; i++)
		{
			Integer[] j = new Integer[2];
			j[0] = intervals[i][0];
			j[1]= intervals[i][1];
			sorted.add(j);
		}
		
		Integer[] interval = sorted.poll();
		Integer head = interval[0];
		Integer tail = interval[1];
		
		ArrayList<int[]> ans = new ArrayList<int[]>();
		
		while(!sorted.isEmpty())
		{
			interval = sorted.poll();
			if (interval[0] <= tail)
			{
				tail = Math.max(tail, interval[1]);
			}
			else
			{
				ans.add(new int[]{head, tail});
				head = interval[0];
				tail = interval[1];
			}
		}
		ans.add(new int[]{head, tail});
		
		return ans.toArray(new int[ans.size()][2]);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(merge(new int[][] {{1,3},{2,6},{8,10},{15,18}}));
	}
//	/{1,3},{2,6},{8,10},{15,18}
	//{1,4},{5,6}
//	/{1,4},{0,4}
	//{1,4},{0,5}
	//{1,4},{0,2},{3,5}]
	

}
