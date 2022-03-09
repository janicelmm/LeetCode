/*
 * Strategy: Need to keep track of all courses if they need preReq, use the int[numCourses] to list out all courses in an array, and count the preReq for each one. 
 * Filter all the courses that have no preReq and save in a Queue, find out all courses that preReq are in the Queue(no preReq needed), and minus the # of preReq needed for that course
 * If the preReq number reached 0, add to the Queue. 
 * Loop through the array again, and check if all courses required do not have preReq anymore.
 */

import java.util.HashSet;
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

        for (int a = 0; a < track.length; a++) 
        {
            if (track[a] != 0) 
            {
                return false;
            }
        }

        return true;
    }

    public static boolean canFinish2(int numCourses, int[][] prerequisites) {
        Queue<int[]> pre = new LinkedList<>();
        int[] courses = new int[numCourses];
        HashSet<Integer> noPre = new HashSet<>();

        for (int[] i : prerequisites) 
        {
            courses[i[0]]++;
        }

        for (int j = 0; j < courses.length; j++) 
        {
            if (courses[j] == 0) 
            {
                noPre.add(j);
            }
        }

        for (int[] k : prerequisites) 
        {
            if (noPre.contains(k[1])) 
            {
                pre.offer(k);
            }
        }

        while (!pre.isEmpty()) 
        {
            int[] temp = pre.poll();
            int canTake = temp[0];
            courses[canTake]--;
            if (courses[canTake] == 0) 
            {
                noPre.add(canTake);

                for (int[] k : prerequisites) 
                {
                    if (k[1] == canTake) 
                    {
                        pre.offer(k);
                    }
                }
            }
        }

        for (int course : courses) 
        {
            if (course != 0) 
            {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(canFinish(2, new int[][] {{1, 0}}));
    }
}
