import java.util.LinkedList;
import java.util.Queue;

public class Leetcode419BattleshipInABoard {
	
	public static int[] dir = {0,1,0,-1,0};
	
    public static int countBattleships(char[][] board) {
    	
        int z = 0;
        
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++)
        {
            for ( int j = 0; j < board[0].length; j++)
            {
                if (board[i][j] == 'X' && visited[i][j] == false)
                {
                	explore(board, i, j, visited);
                    z++;
                }
            }
        }
        
        return z;
    }
    
    public static void explore(char[][] board, int i, int j, boolean[][] visited)
    {
		if(i >= 0 && j >= 0 && i < board.length && j < board[0].length && board[i][j] == 'X' && visited[i][j] == false)
		{
			visited[i][j] = true;
			explore(board, i+1, j, visited);
			explore(board, i, j+1, visited);
			explore(board, i+1, j, visited);
			explore(board, i, j+1, visited);
		}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBattleships(new char[][] {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}}));
	}

}
