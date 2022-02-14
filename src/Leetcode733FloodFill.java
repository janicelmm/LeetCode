import java.util.LinkedList;
import java.util.Queue;

public class Leetcode733FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        
        if(color != newColor)
        {
        	change(image, sr, sc, color, newColor);
        }

        return image;
    }
    
    public static void change(int[][] image, int i, int j, int color, int newColor)
    {

    	if (i < 0 || i >= image.length || j < 0 || j >= image.length || image[i][j] != color)
        {
    		return;
        }
    	
        image[i][j] = newColor;

        change(image, i+1, j, color, newColor);
        change(image, i, j+1, color, newColor);
        change(image, i-1, j, color, newColor);
        change(image, i, j-1, color, newColor);
    }
    public static int[][] floodFill2(int[][] image, int sr, int sc, int newColor) {
    	
	    int color = image[sr][sc];
	    int[] dir = {0,1,0,-1,0};
	    Queue<int[]> flood = new LinkedList<>();
	    flood.offer(new int[] {sr,sc});
	    
	    while (!flood.isEmpty())
	    {
	        int[] cur = flood.poll();
	        image[sr][sc]= newColor;
	        for (int k = 0; k < dir.length - 1; k++)
	        {
	            int x = cur[0] + dir[k];
	            int y = cur[1] + dir[k+1];
	
	            if (x >= 0 && y >= 0 && x < image.length && y < image[0].length && image[x][y] == color)
	            {
	                flood.offer(new int[] {x, y});
	                image[x][y]= newColor;
	            }
	        }
	
	    }
    
	    return image;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(floodFill2(new int[][]{{0,0,0},{0,1,1}}, 1, 1, 1));
	}
}
