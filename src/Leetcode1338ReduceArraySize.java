import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode1338ReduceArraySize {

	public static int minSetSize(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < arr.length; i++)
        {
            if (!count.containsKey(arr[i]))
            {
                count.put(arr[i], 1);
            }
            else
            {
                count.put(arr[i], count.get(arr[i]) + 1);
            }
        }
        
        int[] temp = new int[count.size()];
        int k = 0;
        for (Integer j : count.keySet())
        {
        	temp[k] = count.get(j);
        	k++;
        }
        
        Arrays.sort(temp);
        int track = 0;
        int ans = 0;
        
        for (int a = temp.length - 1; a >= 0 ; a--)
        {
            track += temp[a];
            ans++;
            if (track >= arr.length/2)
            {
                break;
            }
        }
        return ans;
    }
	public static int minSetSize2(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for (int i : arr)
        {
        	int tally = !count.containsKey(i) ? 1 : count.get(i) + 1;
        	count.put(i, tally);
        }

        Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        for (Integer i : count.keySet())
        {
        	pq.add(count.get(i));
        }
        
        int ans = 0;
        int track = 0;
        while (!pq.isEmpty() && track < arr.length/2)
        {
        	track += pq.poll();
        	ans++;
        }
        
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minSetSize2(new int[] {2,2,3,4}));
	}

}
