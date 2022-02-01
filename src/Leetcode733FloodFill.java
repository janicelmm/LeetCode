
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
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2));
	}
}
