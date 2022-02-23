public class Leetcode1254NumberOfClosedIslands {
    public static int closedIsland(int[][] grid) {
        int count = 0;
        
        for (int i = 1; i < grid.length - 1; i++)
        {
            for (int j = 1; j < grid[i].length - 1; j++)
            {
                if (grid[i][j] == 0)
                {
                    if (explore(i, j, grid))
                    {
                        count++;                          
                    }
                }
            }
        }
        
        return count;
    
    }
    
    public static boolean explore(int i, int j, int[][]grid)
    {
        
        grid[i][j] = -1;
        int[] dir = {0, -1, 0 , 1, 0};
        boolean temp = true;
        
        for (int k = 0; k < dir.length - 1; k++)
        {
            int x = i + dir[k];
            int y = j + dir[k+1];
            
            if (grid[x][y] == -1 || grid[x][y] == 1)
            {
                return true;
            }
            
            if (isOnBoarder(x, y, grid))
            {
                return false;
            }
            temp = explore(x, y, grid) && temp;                 
        }
        
        return temp;
        
    }
    
    public static boolean isOnBoarder(int i, int j, int[][] grid)
    {
        return i == 0 || j == 0 || i == grid.length - 1 || j == grid[i].length - 1;
    }
    
    public static void main(String[] args) {
        System.out.println(closedIsland(new int[][] {{0,0,1,1,0,1,0,0,1,0},{1,1,0,1,1,0,1,1,1,0},{1,0,1,1,1,0,0,1,1,0},{0,1,1,0,0,0,0,1,0,1},{0,0,0,0,0,0,1,1,1,0},{0,1,0,1,0,1,0,1,1,1},{1,0,1,0,1,1,0,0,0,1},{1,1,1,1,1,1,0,0,0,0},{1,1,1,0,0,1,0,1,0,1},{1,1,1,0,1,1,0,1,1,0}}));
    }
}
