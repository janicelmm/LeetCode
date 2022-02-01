import java.util.HashSet;
import java.util.Set;

public class Leetcode1079LetterTiles {
	
	private static Set<String> allTiles = new HashSet<String>();

    public static int numTilePossibilities(String tiles) {

    	if (tiles.length() == 1)
        {
            return 1;
        }
        
        for (int i = 0; i < tiles.length(); i++)
        {           
            explore(i, tiles, allTiles);   
        }
        
        for (int j = tiles.length(); j >= 0; j--)
        {           
            explore2(j, tiles, allTiles);   
        }

    	return allTiles.size();
        
    }
    
    public static int explore(int i, String tiles, Set<String> allTiles)
    {
    	String s = "";
    	int expand = 1;
    	
    	while (i+expand <= tiles.length())
    	{
        	s = tiles.substring(i, i+expand);
        	
        	if (!allTiles.contains(s))
        	{
        		allTiles.add(s);
        	}
        	expand++;
    	}
    	
    	return allTiles.size();
    }
    
    public static int explore2(int j, String tiles, Set<String> allTiles)
    {
    	String s = "";
    	int expand = 1;
    	
    	while (j-expand >=0)
    	{
        	s += tiles.charAt(j-expand);
        	
        	if (!allTiles.contains(s))
        	{
        		allTiles.add(s);
        	}
        	expand++;
    	}
    	
    	return allTiles.size();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTilePossibilities("AAB"));
	}

}
