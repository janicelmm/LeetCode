import java.util.LinkedList;
import java.util.Queue;

public class Leetcode1020NumberofEnclaves {
    public static int numEnclaves(int[][] grid) {
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) 
        {
            for (int j = 0; j < grid[0].length; j++) 
            {
                if (grid[i][j] == 1) 
                {
                    count++;

                    if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1) 
                    {
                        count--;
                        q.offer(new int[] { i, j });
                    }
                }
            }
        }

        while (!q.isEmpty()) 
        {
            int[] temp = q.poll();
            count -= explore(temp[0], temp[1], grid, visited);
        }

        return count;
    }

    public static int explore(int i, int j, int[][] grid, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] == true) 
        {
            return 0;
        }

        visited[i][j] = true;
        int[] dir = { 0, -1, 0, 1, 0 };
        int sum = 0;

        for (int k = 0; k < dir.length - 1; k++) 
        {
            int x = i + dir[k];
            int y = j + dir[k + 1];

            if (x > 0 && y > 0 && x < grid.length - 1 && y < grid[0].length - 1 && visited[x][y] == false && grid[x][y] == 1) 
            {
                sum++;
                sum += explore(x, y, grid, visited);
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(numEnclaves(new int[][] {{0,0,0,1,1,1,0,1,0,0},{1,1,0,0,0,1,0,1,1,1},{0,0,0,1,1,1,0,1,0,0},{0,1,1,0,0,0,1,0,1,0},{0,1,1,1,1,1,0,0,1,0},{0,0,1,0,1,1,1,1,0,1},{0,1,1,0,0,0,1,1,1,1},{0,0,1,0,0,1,0,1,0,1},{1,0,1,0,1,1,0,0,0,0},{0,0,0,0,1,1,0,0,0,1}}));
    }
}
