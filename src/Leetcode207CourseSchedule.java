/*
 * Strategy: Need to keep track of all courses if they need preReq, use the int[numCourses] to list out all courses in an array, and count the preReq for each one. 
 * Filter all the courses that have no preReq and save in a Queue, find out all courses that preReq are in the Queue(no preReq needed), and minus the # of preReq needed for that course
 * If the preReq number reached 0, add to the Queue. 
 * Loop through the array again, and check if all courses required do not have preReq anymore.
 */

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode207CourseSchedule {
	public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] track = new int[numCourses];
        
        for (int[] i : prerequisites)
        {
            track[i[0]]++;
        }
        
        Queue<Integer> noPre = new LinkedList<>();
        
        for (int j = 0; j < track.length; j++)
        {
            if (track[j] == 0)
            {
                noPre.offer(j);
            }
        }
        
        while (!noPre.isEmpty())
        {
            int current = noPre.poll();
            
            for (int[] k : prerequisites)
            {
                if (track[k[0]] == 0)
                {
                    continue;
                }
                    
                if (k[1] == current)
                {
                    track[k[0]]--;
                }
                
                if (track[k[0]] == 0)
                {
                    noPre.offer(k[0]);
                }
            }
        }
        
        for(int a = 0; a < track.length; a++)
        {
            if (track[a] != 0)
            {
                return false;
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canFinish(2, new int[][] {{1,0}}));
	}

}
