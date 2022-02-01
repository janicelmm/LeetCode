
public class Leetcode200NumberOfIslands {
	public int numIslands(char[][] grid) {
		  boolean[][] visited = new boolean[grid.length][grid[0].length];
		  int count = 0;
		 
		  for (int i = 0; i < grid.length; i++)
		  {
		      for (int j = 0; j < grid[0].length; j++)
		      {
		          if ((grid[i][j] == '1') && (visited[i][j] == false))
	              {
	                  explore(visited, grid, i , j);
	                  count++;
	              }
	          }
	      }
	      return count;
	  }
	 
	 public void explore(boolean[][] visited, char[][] grid, int i, int j)
	 {
	      if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
	          {
	              return;    
	          }
	         
	          if (grid[i][j] == '1')
	          {
	              visited[i][j] = true;
	             
	              explore(visited, grid, i+1, j);
	              explore(visited, grid, i, j+1);
	          }
	 }
		 
	public static int numIslands2(char[][] grid) {
		 boolean[][] visited = new boolean[grid.length][grid[0].length];
		 int count = 0;
		 
		 for (int i = 0; i < grid.length; i++)
		 {
		     for (int j = 0; j < grid[0].length; j++)
		     {
		         if((grid[i][j] == '1') && (visited[i][j] == false))
	             {
	                 explore2(grid, visited, i, j);
	                 count++;
	             }
	         }
	     }
	     return count;
	 }
	 public static void explore2(char[][] grid, boolean[][] visited, int i, int j)
	 {
	     if(i >= grid.length || j >= grid[0].length)
	     {
	         return;
	     }
	     
	     if ((grid[i][j] == '1') && (visited[i][j] == false))
	     {
	         visited[i][j] = true;
	         explore2(grid, visited, i+1, j);
	         explore2(grid, visited, i, j+1);
	     }
	 }
	 
	 public static int numIslands3(char[][] grid) {
		 boolean[][] visited = new boolean[grid.length][grid[0].length];
		 int count = 0;
		 
		 for (int i = 0; i < grid.length; i++)
		 {
			 for (int j = 0; j < grid[i].length; j++)
			 {
				 if(grid[i][j] == '1' && visited[i][j] == false)
				 {
					 explore(grid, i, j, visited);
					 count++;
				 }
			 }
		 }
		 return count;
		 
	 }
	 
	 public static void explore(char[][] grid, int i, int j, boolean[][] visited) {
		 
         if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length)
         {
             return;
         }
         else if (grid[i][j] == '1' && visited[i][j] == false)
		 {
			 visited[i][j] = true;
			 explore(grid, i, j+1, visited);
			 explore(grid, i+1, j, visited);
			 explore(grid, i-1, j, visited);
			 explore(grid, i, j-1, visited);
		 }
		 else
			 return;
	 }
			 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numIslands3(new char[][] {{'1','1','1'},{'0','1','0'},{'1','1','1'}}));
	}
}

//{{"1","1","1"},{"0","1","0"},{"1","1","1"}}
//{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}}
