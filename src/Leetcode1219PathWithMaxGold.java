
public class Leetcode1219PathWithMaxGold {
	private static int count = 0;
	
	public static int getMaximumGold(int[][] grid) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if (grid[i][j] != 0 && visited[i][j] == false)        
                {
                    explore(i, j, grid, visited);   
                }
            }
        
        }
        return count;
    }
	
	public static int explore(int i, int j, int[][] grid, boolean[][] visited) {

		if (i >= grid.length || j >= grid[0].length)
		{
			return count;
		}
					
		if (grid[i][j] != 0 && visited[i][j] == false)        
        {
			count += grid[i][j];
			visited[i][j] = true;
			if (j+1 < grid[0].length && visited[i][j+1] == false)
			{
				explore(i, j+1, grid, visited);
			}
			if (i+1 < grid.length && visited[i+1][j] == false)
			{
				explore(i+1, j, grid, visited);
			}		
        }
		return count;

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMaximumGold(new int[][] {{0,6,0},{5,8,7},{0,9,0}}));
		
	}

}
