import java.util.ArrayList;
import java.util.List;

public class Leetcode417 {
	public static int[] dir = {0,1,0,-1,0};
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
    	
    	List<List<Integer>> ans = new ArrayList<>();
    	int x = heights.length;
    	int y = heights[0].length;
    	
    	if (heights.length == 0 || heights == null)
    	{
    		return ans;
    	}
    	
    	boolean[][] atlantic = new boolean[x][y];
    	boolean[][] pacific = new boolean[x][y];
    	
    	for (int i = 0; i < y; i++)
    	{
    		dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
    		dfs(heights, x-1, i, Integer.MIN_VALUE, atlantic);
    	}
    	
    	for (int i = 0; i < x; i++)
    	{
    		dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
    		dfs(heights, i, y-1, Integer.MIN_VALUE, atlantic);
    	}
    	
    	for (int i = 0;i < heights.length; i++)
        {
            for (int j = 0; j < heights[0].length; j++)
            {
                if (atlantic[i][j] && pacific[i][j])
                {
                	List<Integer> cur = new ArrayList<>();
                	cur.add(i);
                	cur.add(j);
                	ans.add(cur);
                }
            }
        }
    	return ans;
    }
    
    public static void dfs (int[][] heights, int i, int j, int prev, boolean[][] ocean)
    {
    	if (i < 0 || j < 0 || i >= ocean.length || j >= ocean[0].length)
    	{
    		return;
    	}
    	
    	if (heights[i][j] < prev || ocean[i][j])
    	{
    		return;
    	}
    	
    	ocean[i][j] = true;
    	
    	for (int k = 0; k < dir.length - 1; k++)
    	{
    		int x = i + dir[k];
    		int y = j + dir[k+1];
    		dfs(heights, x, y, heights[i][j], ocean);
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (pacificAtlantic(new int[][] {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}}));
	}

}
