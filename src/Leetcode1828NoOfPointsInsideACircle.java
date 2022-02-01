
public class Leetcode1828NoOfPointsInsideACircle {

    public static int[] countPoints(int[][] points, int[][] queries) {
        
        int [] res = new int[queries.length];
        for (int a = 0; a < queries.length; a++)
        {
            int count = 0;
            for (int b = 0; b < points.length; b++)
            {
            	int x = Math.abs(points[b][0] - queries[a][0]);
            	int y = Math.abs(points[b][1] - queries[a][1]);

            	if (x * x + y * y <= queries[a][2] * queries[a][2])
            	{
            		count++;
            	}
            }
            res[a] = count;
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPoints(new int[][]{{1,3},{3,3},{5,3},{2,2}}, new int[][]{{2,3,1},{4,3,1},{1,1,2}}));
	}

}
