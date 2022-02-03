/* 
 * Strategy: Dynamic programming, start with a smaller block. 
 * Build the number of ways to get to a grid, and eventually to the destination grid
 */

public class Leetcode62UniquePath {

    public static int uniquePaths(int m, int n) {
        int[][] count = new int[m][n];
        count[0][0] = 1;
        
        for (int i = 0; i < m ; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == 0 || j == 0)
                {
                    count[i][j] = 1;    
                }
                else
                {
                    count[i][j] = count[i-1][j] + count[i][j-1];
                }
            }
        }
        return count[m-1][n-1];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(3,7));
	}

}
