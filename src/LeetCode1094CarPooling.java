import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode1094CarPooling {
	public static boolean carPooling(int[][] trips, int capacity) {
		HashMap<Integer, Integer> pickDrop = new HashMap<Integer, Integer>();
		Queue<Integer> sorted = new PriorityQueue<Integer>();
		
        for (int i = 0; i < trips.length; i++)
        {
        	if (!pickDrop.containsKey(trips[i][1]))
        	{
        		sorted.add(trips[i][1]);
        	}
        	if (!pickDrop.containsKey(trips[i][2]))
        	{
        		sorted.add(trips[i][2]);
        	}
        
        	pickDrop.put(trips[i][1], pickDrop.getOrDefault(trips[i][1], 0) + trips[i][0]);
        	pickDrop.put(trips[i][2], pickDrop.getOrDefault(trips[i][2], 0) - trips[i][0]);
        }
	
        int count= 0;
        	
        while(!sorted.isEmpty())
        {
        	Integer temp = sorted.poll();
        	count += pickDrop.get(temp);
        	if (count > capacity)
        	{
        		return false;
        	}
        }
        return true;
	}
	
	public static boolean carPooling2(int[][] trips, int capacity) {
		int[] stops= new int[1001];
		for (int[] trip : trips)
		{
			stops[trip[1]] += trip[0];
			stops[trip[2]] -= trip[0];
		}
		
		for(int stop : stops)
		{
			capacity -= stop;
		}
		return capacity >= 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(carPooling(new int[][] {{7,5,7},{8,1,9},{10,2,6},{4,7,8},{2,1,3}}, 26));
	}
	//{{2,1,5},{3,3,7}}, 4 false
//	/{{3,2,8},{4,4,6},{10,8,9}}, 11 true
	//{{9,3,6},{8,1,7},{6,6,8},{8,4,9},{4,2,9}}, 28 false
	//{{3,2,7},{3,7,9},{8,3,9}}, 11 true
	//{{2,2,6},{2,4,7},{8,6,7}}, 11 true
	//{{7,5,7},{8,1,9},{10,2,6},{4,7,8},{2,1,3}}, 26 true
}
