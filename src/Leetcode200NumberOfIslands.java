
public class Leetcode200NumberOfIslands {
		 
    public static int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int ans = 0;
        
		 for (int i = 0; i < grid.length; i++)
         {
             for (int j = 0; j < grid[0].length; j++)
             {
                 if (grid[i][j] == '1' && visited[i][j] == false)
                 {
                     explore(grid, i, j, visited);
                     ans++;
                 }
             }
         }
        return ans;
    }
    
    public static void explore(char[][] grid, int i, int j, boolean[][] visited)
    {
        if(i >= 0 && j >= 0 && i < grid.length && j < grid[0].length)
        {
			if (grid[i][j] == '1' && visited[i][j] == false)
			{
		    	visited[i][j] = true;
		
		    	explore(grid, i+1, j, visited);
		    	explore(grid, i, j+1, visited);
		    	explore(grid, i-1, j, visited);
		    	explore(grid, i, j-1, visited);            	
			}
        }
    }
			 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numIslands(new char[][] {{'1','0','1'},{'1','0','1'},{'1','1','1'}}));
	}
}

//{{"1","1","1"},{"0","1","0"},{"1","1","1"}}
//{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}}
