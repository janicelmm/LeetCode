import java.util.LinkedList;
import java.util.Queue;

public class leetcode934ShortestBridge {

    public static int[] dir = { 0, -1, 0, 1, 0 };

    public static int shortestBridge(int[][] grid) {
        boolean first = false;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) 
        {
            for (int j = 0; j < grid[0].length; j++) 
            {
                if (grid[i][j] == 1) 
                {
                    if (!first) 
                    {
                        dfs(grid, i, j);
                        first = true;
                    } 
                    else 
                    {
                        queue.add(new int[] { i, j, 0 });
                    }
                }
            }
        }

        while (!queue.isEmpty()) 
        {
            int size = queue.size();
            for (int a = 0; a < size; a++) 
            {
                int[] cur = queue.poll();
                for (int k = 0; k < dir.length - 1; k++) 
                {
                    int x = cur[0] + dir[k];
                    int y = cur[1] + dir[k + 1];
                    int z = cur[2];

                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] != 1) 
                    {
                        if (grid[x][y] == 2) 
                        {
                            return z;
                        }

                        if (grid[x][y] == 0) 
                        {
                            grid[x][y] = 1;
                            queue.offer(new int[] { x, y, z + 1 });
                        }
                    }
                }
            }
        }
        
        return 0;
    }

    public static void dfs(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) 
        {
            grid[i][j] = 2;
            
            for (int k = 0; k < dir.length - 1; k++) 
            {
                int x = i + dir[k];
                int y = j + dir[k + 1];
                
                dfs(grid, x, y);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(shortestBridge(new int[][] { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 1 } }));
        // {{0,1,0}, {0,0,0}, {0,0,1}}
        // {{0,1},{1,0}}
        // {{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}}
    }
}
