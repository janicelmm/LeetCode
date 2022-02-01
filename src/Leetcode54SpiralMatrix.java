import java.util.ArrayList;
import java.util.List;

public class Leetcode54SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int colStart = 0;
        int rowStart = 0;
        int colEnd = matrix[0].length - 1;
        int rowEnd = matrix.length - 1;
        List<Integer> ans = new ArrayList<>();
    
        while (colStart <= colEnd && rowStart <= rowEnd)
        {
            for(int i = colStart; i <= colEnd; i++)
            {
               ans.add(matrix[rowStart][i]); 
            }
            rowStart++;
            
            for(int j = rowStart; j <= rowEnd; j++)
            {
               ans.add(matrix[j][colEnd]); 
            }
            colEnd--;
            
            for(int i = colEnd; i >= colStart; i--)
            {
                ans.add(matrix[rowEnd][i]); 
            }
            rowEnd--;
            
            for(int j = rowEnd; j >= rowStart; j--)
            {
                ans.add(matrix[j][colStart]); 
            }
            colStart++;
            
//            if(rowStart<=rowEnd)
//            {
//                for(int i = colEnd; i >= colStart; i--)
//                {
//                    ans.add(matrix[rowEnd][i]); 
//                }
//                rowEnd--;
//            }
//            
//            if(colStart<=colEnd)
//            {
//                for(int j = rowEnd; j >= rowStart; j--)
//                {
//                    ans.add(matrix[j][colStart]); 
//                }
//                colStart++;
//            }
            
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
	}

}
