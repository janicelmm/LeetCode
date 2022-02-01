
public class Leetcode832FlipAnImage {
	public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++)
        {
            int len = A[i].length;
            for (int j = 0; j < len/2; j++)
            {
                int temp = A[i][j];
                A[i][j] = A[i][len -(j+1)];
                A[i][len -(j+1)] = temp;
            }
            
            for (int k = 0; k < len; k++)
            {
                A[i][k] = 1 - A[i][k];
            }
        }
        
        return A;
    }
	
	public static int[][] flipAndInvertImage2(int[][] A) {

        for (int i = 0; i < A.length; i++)
        {
            int a = 0;
            int b = A[0].length - 1;
            
        	while (a <= b)
        	{
        		if (A[i][a] == A[i][b])
        		{
        			A[i][a] = 1 - A[i][a];
        			A[i][b] = 1 - A[i][b];
        		}
        		a++;
        		b--;
        	}
        }
        return A;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(flipAndInvertImage2(new int[][] {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
	}
}

//[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]