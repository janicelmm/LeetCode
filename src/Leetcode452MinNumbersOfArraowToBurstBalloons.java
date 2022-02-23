import java.util.Arrays;

public class Leetcode452MinNumbersOfArraowToBurstBalloons {
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (int[]a, int[]b) -> Integer.compare(a[1], b[1]));
        int end = points[0][1];
        int count = 1;
        
        for (int i = 1; i < points.length; i++)
        {
            if (points[i][0] > end)
            {
                count++;
                end = points[i][1];
            }
        }
       
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(findMinArrowShots(new int[][] {{10,16},{2,8},{1,6},{7,12}}));
    }

}
