import java.util.HashSet;

public class Leetcode73SetMatrixZeros {
    public static int[][] setZeroes(int[][] matrix) {
        
        boolean[][] explore = new boolean[matrix.length][matrix[0].length];
        HashSet<Integer> horizontal = new HashSet<>();
        HashSet<Integer> vertical = new HashSet<>();
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                explore[i][j] =  true;
                if (matrix[i][j] == 0)
                {
                    horizontal.add(i);
                    vertical.add(j);
                    changeZero(i, j, matrix, explore, horizontal, vertical);
                }
            }
        }
        return matrix;
    }
    
    public static void changeZero(int i, int j, int[][] matrix, boolean[][] explore, HashSet<Integer> horizontal,  HashSet<Integer> vertical)
    {
        if (i < 0 || i > matrix.length - 1 || j < 0 || j >= matrix[0].length - 1)
        {
            return;
        }
        
        if (matrix[i][j] == 0 && explore[i][j] == false)
        {
            horizontal.add(i);
            vertical.add(j);
        }
        
        if (horizontal.contains(i) && explore[i][j] == false)
        {
            matrix[i][j] = 0;
            explore[i][j] =  true;
        }
        
        if (vertical.contains(j) && explore[i][j] == false)
        {
            matrix[i][j] = 0;
            explore[i][j] =  true;
        }
        
        changeZero(i+1, j, matrix, explore, horizontal, vertical);
        changeZero(i, j+1, matrix, explore, horizontal, vertical);
        changeZero(i-1, j, matrix, explore, horizontal, vertical);
        changeZero(i, j-1, matrix, explore, horizontal, vertical);
    }
    
    public static int[][] setZeroes2(int[][] matrix) {
      
        HashSet<Integer> vertical = new HashSet<>();
        HashSet<Integer> horizontal = new HashSet<>();
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                	vertical.add(i);
                	horizontal.add(j);
                }
            }
        }
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (vertical.contains(i) || horizontal.contains(j))
                {
                	matrix[i][j] = 0;
                }
            }
        }
        
        return matrix;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setZeroes2(new int[][] {{1,1,1},{1,0,1},{1,1,1}}));
	}

}
