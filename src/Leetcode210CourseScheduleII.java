import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode210CourseScheduleII {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[numCourses];

        if (prerequisites == null || prerequisites.length == 0 || prerequisites[0].length == 0) 
        {
            for (int i = 1; i < ans.length; i++) 
            {
                ans[i] = ans[i - 1] + 1;
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

        while (!noPre.isEmpty()) 
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

        for (int a = 0; a < track.length; a++) 
        {
            if (track[a] != 0) 
            {
                return new int[] {};
            }
        }

        return ans;

    }

    public static int[] findOrder2(int numCourses, int[][] prerequisites) {
        int[] pre = new int[numCourses];
        HashSet<Integer> noPre = new HashSet<>();
        Queue<int[]> courses = new LinkedList<>();

        for (int[] i : prerequisites) 
        {
            pre[i[0]]++;
        }

        int[] ans = new int[numCourses];
        int index = 0;

        for (int p = 0; p < pre.length; p++) 
        {
            if (pre[p] == 0) 
            {
                noPre.add(p);
                ans[index] = p;
                index++;
            }
        }

        for (int[] j : prerequisites) 
        {
            if (noPre.contains(j[1])) 
            {
                courses.offer(j);
            }
        }

        while (!courses.isEmpty()) 
        {
            int[] temp = courses.poll();
            int course = temp[0];
            pre[course]--;

            if (pre[course] == 0) 
            {
                ans[index] = course;
                index++;
                noPre.add(course);

                for (int[] k : prerequisites) 
                {
                    if (k[1] == course) 
                    {
                        courses.offer(k);
                    }
                }
            }
        }

        for (int a : pre) 
        {
            if (a != 0) 
            {
                return new int[] {};
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findOrder2(4, new int[][] {{1,0}, {2,0}, {3,1}, {3,2}}));
    }
}
