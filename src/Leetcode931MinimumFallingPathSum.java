import java.util.HashMap;

public class Leetcode931MinimumFallingPathSum {
	public static int minFallingPathSum(int[][] matrix) {
       int min = 100*matrix.length;
       int[][] finalMatrix = findMinPath(matrix);

       for (int i = 0; i < finalMatrix[0].length; i++)
       {
    	   min = Math.min(min, matrix[0][i]);
       }
       return min;
    }
	
	public static int[][] findMinPath(int[][] matrix)
	{
		for (int j = matrix.length - 2; j >=0; j--)
		{
			for (int i = 0; i < matrix[j].length; i++) 
			{
				int[] pos = {i-1, i, i+1};
				int min = 100*matrix.length;
				int nextpos = 0; 
				
				for (int k = 0; k < pos.length; k++)
				{
					nextpos = pos[k];
					if(nextpos < 0 || nextpos >= matrix.length)
					{
						continue;
					}
					min = Math.min(min,  matrix[j+1][nextpos]);
				}
				matrix[j][i] += min;
			}
		}
		return matrix;
	}
	
    public int minFallingPathSumwrong(int[][] matrix) {
        int sum = 0;
               
        for (int i = 0; i < matrix[0].length; i++)
        {
            sum = Math.min(sum, findMinPathwrong(matrix, i));
        }
        
        return sum;
    }
    
    public int findMinPathwrong(int[][] matrix, int i)
    {
        int sum = matrix[0][i];
        
        for (int j = 1; j < matrix.length; j++)
        {
            int[] nextPositions = {i-1, i, i+1};
            
            HashMap<Integer, Integer> valueToIndex = new HashMap<Integer, Integer>();
            
            int min = 0;
            
            for (int k = 0; k < nextPositions.length; k++)
            {
                int nextPos = nextPositions[k];
                
                if (nextPos < 0 || nextPos >= matrix.length)
                    continue;
                
                valueToIndex.put(matrix[j][nextPos], nextPos);
                min = Math.min(min, matrix[j][nextPos]);
            }
            
            i = valueToIndex.get(min);
            sum += min;
        }
        
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minFallingPathSum(new int[][] {{2,1,3},{6,5,4},{7,8,9}}));
	}

}
