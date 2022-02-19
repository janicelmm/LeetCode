import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class leetcode435NonoverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        
        if (intervals.length == 1)
        {
            return 0;
        }
        
        Arrays.sort(intervals, (int[] a, int[] b) -> Integer.compare(a[0], b[0]));
        
        int tail = intervals[0][1];
        int count = 0;
        
        for (int i = 1; i < intervals.length; i++)
        {
            if (tail > intervals[i][0])
            {
                tail = Math.min(tail, intervals[i][1]);
                count++;
            }
            else
            {
                tail = intervals[i][1];
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(eraseOverlapIntervals(new int[][] {{1,2},{2,3},{3,4},{1,3}}));
    }

}
