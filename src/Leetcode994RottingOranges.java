import java.util.LinkedList;
import java.util.Queue;

public class Leetcode994RottingOranges {
    public static int orangesRotting(int[][] grid) {
    	
    	int fresh = 0;
    	int min = 0;
    	Queue<int[]> current = new LinkedList<int[]>();
    	Queue<int[]> next = new LinkedList<int[]>();
    	
    	for (int i = 0; i < grid.length; i++)
    	{
    		for (int j = 0; j < grid[i].length; j++)
    		{
    			if (grid[i][j] == 2)
    			{
    				current.add(new int[]{i, j});
    			}
    			
    			if (grid[i][j] == 1)
    			{
    				fresh++;
    			}
    		}
    	}
    	
    	while (!current.isEmpty())
    	{
    		int[] temp = current.poll();
    		int i = temp[0];
    		int j = temp[1];
    		
    		int[][] adjPos = new int[][] {{i+1, j}, {i-1, j}, {i, j+1}, {i, j-1}};
    		
    		for(int[] pos : adjPos)
    		{
    			if (pos[0] >= 0 && pos[0] <= grid.length - 1 && pos[1] >= 0 && pos[1] <= grid[i].length - 1 && grid[pos[0]][pos[1]] == 1)
    			{
    				next.add(pos);
    				grid[pos[0]][pos[1]] = 2;
    				fresh--;
    			}
    		}
    		
    		if (current.isEmpty() && !next.isEmpty())
    		{
    			min++;
    			current = next;
    			next = new LinkedList<int[]>();
    		}
    	}
    	
    	if (fresh == 0)
    	{
    		return min;
    	}
    	
    	return -1;
    	
    }
    
    public static int[] dir = {0,1,0,-1,0};
    
    public static int orangesRotting2(int[][] grid) {
    	int fresh = 0;
    	Queue<int[]> rot = new LinkedList<>();
    	
    	for (int i = 0; i < grid.length; i++)
    	{
    		for (int j = 0; j < grid[0].length; j++)
    		{
    			if (grid[i][j] == 2)
    			{
    				rot.offer(new int[] {i, j, 0});
    			}
    			
    			if (grid[i][j] == 1)
    			{
    				fresh++;
    			}
    		}
    	}

    	while (!rot.isEmpty())
    	{
    		int size = rot.size();
    		for (int k = 0; k < size; k++)
    		{
    			int[] cur = rot.poll();
    			
    			
    			for (int d = 0; d < dir.length - 1; d++)
    			{
    				int x = cur[0] + dir[d];
    				int y = cur[1] + dir[d+1];
    				int z = cur[2];
    				
    				
    				if (x >=0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1)
    				{
    					grid[x][y] = 2;
    					rot.offer(new int[] {x,y, z+1});
    					fresh--;
    					
    					if (fresh == 0)
    					{
    						return z+1;
    					}
    				}
    			}
    		}
    	}
    	
    	return -1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(orangesRotting2(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
	}
	//{2,1,1}, {0,1,1}, {1,0,1}
	//{{2,1,1},{1,1,1},{0,1,2}}

}
