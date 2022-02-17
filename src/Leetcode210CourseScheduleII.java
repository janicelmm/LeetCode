import java.util.LinkedList;
import java.util.Queue;

public class Leetcode210CourseScheduleII {
	 public static int[] findOrder(int numCourses, int[][] prerequisites) {
		 
	 	int[] ans = new int[numCourses];
	 	
        if (prerequisites == null || prerequisites.length == 0 || prerequisites[0].length == 0)
        {
            for (int i = 1; i < ans.length; i++)
            {
                ans[i] = ans[i-1] + 1;
            }
            return ans;
        }
        
        int[] track = new int[numCourses];
        Queue<Integer> noPre = new LinkedList<>();
        int index = 0;
        
        for (int[] i : prerequisites)
        {
            track[i[0]]++;
        }
        
        for (int j = 0; j < track.length; j++)
        {
            if (track[j] == 0)
            {
                noPre.offer(j);
            }
        }
        
        while(!noPre.isEmpty())
        {
            int cur = noPre.poll();
            ans[index] = cur;
            index++;
                
            for (int[] k : prerequisites)
            {
                if (k[1] == cur)
                {
                    track[k[0]]--;
                    
                    if (track[k[0]] == 0)
                    {
                        noPre.offer(k[0]);
                    }
                }
            }
        }
        
        for(int a = 0; a < track.length; a++)
        {
            if (track[a] != 0)
            {
                return new int[]{};
            }
        }
        
        return ans;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findOrder(2, new int[][] {{1,0}, {0,1}}));
	}

}
