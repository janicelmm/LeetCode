/*
 * Strategy: Need to consider if the block is on the edge
 */
public class Leetcode63UniquePathII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if (obstacleGrid[0][0] == 1)
        {
        	return 0;
        }
        
        int[][] track = new int[obstacleGrid.length][obstacleGrid[0].length];
        track[0][0] = 1;
        
        for (int i = 0; i < obstacleGrid.length; i++)
        {
            for (int j = 0; j < obstacleGrid[0].length; j++)
            {
            	
                if (obstacleGrid[i][j] == 1)
                {
                    continue;
                }
                else if ((i > 0 && track[i-1][0] != 0) || (j > 0 && track[0][j-1] != 0))
                {
                    track[i][j] = 1;
                }
                
                if (i > 0 && j > 0)
                {
                    track[i][j] = track[i-1][j] + track[i][j-1];
                }
            }
        }
        
        return track[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePathsWithObstacles(new int[][] {{0,0,1},{0,1,0},{0,0,0}}));
	}
}
