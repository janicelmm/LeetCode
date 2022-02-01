import java.util.HashSet;

public class Leetcode547NumberOfProvinces {
    public static int findCircleNum(int[][] isConnected) {
        HashSet<Integer> visited = new HashSet<Integer>();
        
        int count = 0;
        for(int i = 0; i < isConnected.length; i++)
        {   
			if (!visited.contains(i))
			{
				helper(i, isConnected, visited);
				count++;
			}
        }
        return count;
    }
    
    public static void helper(int i, int[][] isConnected, HashSet<Integer> visited) {
    	for(int k = 0; k < isConnected[i].length; k++)
    	{
    		if (isConnected[i][k] == 1 && !visited.contains(k))
    		{
    			visited.add(k);
    			helper(k, isConnected, visited);
    		}
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findCircleNum(new int[][] {{1,1,0},{1,1,0},{0,0,1}}));
	}

}

//{{1,1,0},{1,1,0},{0,0,1}}
//{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}}