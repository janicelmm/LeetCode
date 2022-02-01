import java.util.HashSet;

public class CodeSignal8MatricElementSum {
	
	public static int matrixElementsSum(int[][] matrix) {
	    
	    int cost = 0;
	    HashSet<Integer> skip = new HashSet<Integer>();
	    
	    for (int i = 0; i < matrix.length; i++)
	    {
	        for(int j = 0; j < matrix[0].length; j++)
	        {
	            if ((matrix[i][j] == 0) && (!skip.contains(j)))
	            {
	                skip.add(j);
	            }
	            if ((matrix[i][j] != 0) && (!skip.contains(j)))
	            {                
	                cost += matrix[i][j];
	            }
	        }
	    }
	    return cost;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(matrixElementsSum(new int[][] {{0, 1, 1, 2},{0, 5, 0, 0},{2, 0, 3, 3}}));
	}

}
