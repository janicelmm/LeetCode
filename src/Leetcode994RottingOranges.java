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
    
    public static int orangesRotting2(int[][] grid) {
    	int freshOranges = 0;
    	Queue<int[]> rottenPositions = new LinkedList<int[]>();
    	Queue<int[]> newRot = new LinkedList<int[]>();
    	int min = 0;
    	
    	for (int i = 0; i < grid.length; i++)
    	{
    		for (int j = 0; j < grid[i].length; j++)
    		{
    			if (grid[i][j] == 2)
    			{
    				rottenPositions.add(new int[] {i, j});
    			}
    			
    			if (grid[i][j] == 1)
    			{
    				freshOranges++;
    			}
    		}
    	}
    	
    	while (!rottenPositions.isEmpty())
    	{
    		int[] currentPos = rottenPositions.poll();
    		int i = currentPos[0];
    		int j = currentPos[1];
    		
    		int[][] adjPositions = {{i+1, j}, {i-1, j}, {i, j+1}, {i, j-1}};
    		
    		for (int[] adjPos : adjPositions)
    		{
    			i = adjPos[0];
    			j = adjPos[1];
    			if (i >=0 && j >=0 && i <= grid.length - 1 && j <= grid[i].length - 1 && grid[i][j] == 1)
    			{
    				newRot.add(new int[]{i, j});
    				grid[i][j] = 2;
    				freshOranges--;
    			}
    		}
    		
    		if (rottenPositions.isEmpty() && !newRot.isEmpty())
    		{
    			min++;
    			rottenPositions = newRot;
    			newRot = new LinkedList<int[]>();
    		}
     	}
    	
    	if(freshOranges == 0)
    	{
    		return min;
    	}
    	
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(orangesRotting2(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
	}
	//{2,1,1}, {0,1,1,}, {1,0,1}

}
