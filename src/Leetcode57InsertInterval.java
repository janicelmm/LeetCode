import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode57InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        Comparator<Integer[]> com = (a, b) -> a[0].compareTo(b[0]);
        Queue<Integer[]> sort = new PriorityQueue<Integer[]>(com);
        
        for (int i = 0; i < intervals.length; i++)
        {
            Integer[] j = new Integer[2];
        	j[0] = intervals[i][0];
        	j[1]= intervals[i][1];
        	sort.offer(j);
        }
        
        Integer[] temp = new Integer[]{newInterval[0], newInterval[1]};
        sort.offer(temp);
        
        List<int[]> ans = new ArrayList<>();
        Integer[] first = sort.poll();
        int head = first[0]; 
        int tail = first[1];
        
        while (!sort.isEmpty())
        {
            Integer[] cur = sort.poll();
            if (cur[0] <= tail)
            {
                tail = Math.max(tail, cur[1]);
            }
            else
            {
                ans.add(new int[]{head, tail});
                head = cur[0];
                tail = cur[1];
            }
        }
        ans.add(new int[]{head, tail});
        
        return ans.toArray(new int[ans.size()][2]);
    }
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(insert(new int[][] {{1,3}, {6,9}}, new int[] {2,5}));
    }

}
