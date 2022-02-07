
public class Leetcode695MaxAreaOfIsland {
    public static int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;
        
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {    
                if (grid[i][j] == 1 && visited[i][j] == false)
                {
                    max = Math.max(max, explore(grid, visited, i, j));
                }
            }
        }
        
        return max;
    }
    
    public static int explore(int[][] grid, boolean[][] visited, int i, int j)
    {
    	int area = 0;
    	
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length)
        {
            if (grid[i][j] == 1 && visited[i][j] == false)
            {
                visited[i][j] = true;
                area++;
                area += explore(grid, visited, i+1, j);
                area += explore(grid, visited, i, j+1);
                area += explore(grid, visited, i-1, j);
                area += explore(grid, visited, i, j-1);
            }
        }
        return area;    
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxAreaOfIsland(new int[][] {{1,1,1},{0,1,0}}));
	}

}
