import java.util.LinkedList;
import java.util.Queue;

public class Leetcode463IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        
        int ans = 0;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (grid[i][j] == 1)
                {
                    ans += explore(grid, i, j);
                }
            }
        }
        return ans;
    }
    
    public static int explore(int[][] grid, int i, int j)
    {
        int ans = 0; 
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == 1)
        {
        	ans = 4;
        	int[] dir = {0, 1, 0, -1, 0};
        	
        	for (int k = 0; k < dir.length - 1; k++)
        	{
        		int x = i + dir[k];
        		int y = j + dir[k+1];
        		
        		if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == 1)
        		{
        			ans--;
        		}
        	}
        }
        return ans;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(islandPerimeter(new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
	}

}
