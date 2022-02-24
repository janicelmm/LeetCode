import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode1696JumpGameVI {
    public static int maxResult(int[] nums, int k) {
        
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        pq.add(new int[] {nums[0], 0});
        int res = nums[0];
        
        for (int i = 1; i < nums.length; i++)
        {
            while(!pq.isEmpty() && pq.peek()[1] < i-k)
            {
                pq.poll();
            }
            pq.add(new int[] {res = nums[i] + pq.peek()[0], i});
        }
        
        return res;
        
    }
    
    public static void main(String[] args) {
       System.out.println(maxResult(new int[] {40,30,-100,-100,-10,-7,-3,-3}, 2));
    }

}
