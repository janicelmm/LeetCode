
public class Leetcode48RotateImage {
	public static int[][] rotate(int[][] matrix) {
		int top = 0;
		int bottom = matrix.length - 1; 
		
        while (top <bottom)
        {
            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
            top++;
            bottom--;
        }
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = i+1; j < matrix[0].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotate(new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}));
	}

}
