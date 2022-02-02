/* Strategy: To use a helper function to check the adj character once the first character is found.
 * While statement is not necessarily needed for a recursive method. If one inner loop returns true, and the outer loop returns false, the true is lost. 
 * By checking index == word.length() - 1, I am making sure index will not go out of bound already.
 * Too keep track of boolean answer, we can use "||" i.e ans = ans || boolean function, so it will always track the true. 
 * To add the out of bound check that applies to all i+1, i-1, j+1, j-1, use another helper function.
 */

public class Leetcode79WordSearch {

	 public static boolean exist(char[][] board, String word) 
	 {
        boolean ans = false;
        
        for(int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                if (board[i][j] == word.charAt(0))
                {	
                    ans = findWord(i, j, new boolean [board.length][board[i].length], board, word, 0);
                    
                    if (ans)
                    	return true;
                }
            }
        }
        
        return ans;
    }
    
    public static boolean findWord(int i, int j, boolean[][] explored, char[][] board, String word, int index)
    {
        if (board[i][j] != word.charAt(index))
        {
            return false;
        }
        else if (index == word.length() - 1)
        {
        	return true;
        }
        
        boolean ans = false;
        
        explored[i][j] = true;
        
    	ans = validNextPosition(i+1, j, explored) ? findWord(i+1, j, explored, board, word, index+1) || ans : ans;
    	ans = validNextPosition(i, j+1, explored) ? findWord(i, j+1, explored, board, word, index+1) || ans : ans;
    	ans = validNextPosition(i-1, j, explored) ? findWord(i-1, j, explored, board, word, index+1) || ans : ans;
    	ans = validNextPosition(i, j-1, explored) ? findWord(i, j-1, explored, board, word, index+1) || ans : ans;
    	
    	explored[i][j] = false;
        
        return ans;
    }
    
    public static boolean validNextPosition(int i, int j, boolean[][] explored)
    {
    	if (i < 0 || i >= explored.length || j < 0 || j >= explored[i].length || explored[i][j] == true)
    		return false;
    	
		return true;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(exist(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
	}

}
