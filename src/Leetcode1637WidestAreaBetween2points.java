import java.util.Arrays;

public class Leetcode1637WidestAreaBetween2points {
    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] t = new int[points.length];
        
        for(int i = 0; i < points.length; i++)
        {
            t[i] = points[i][0];
        }
        
        int max = 0;
        Arrays.sort(t);
        for(int j = 0; j < t.length-1; j++)
        {
            max = Math.max(max, t[j+1] - t[j]);
        }
        
        return max;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxWidthOfVerticalArea(new int[][] {{8,7},{9,9},{7,4},{9,7}}));
	}

}
