import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode139wordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        
    	Set<String> ss = new HashSet<>(wordDict);
    	
    	boolean[] temp = new boolean[s.length() + 1];
    	
    	temp[0] = true;
    	
    	for (int i = 1; i <= s.length(); i++)
    	{
    		for (int j = 0; j < i; j++)
    		{
    			if (temp[j] && ss.contains(s.substring(j, i)))
    			{
    				temp[i] = true;
    				break;
    			}
    		}
    	}
    	
    	return temp[s.length()];
    }
    
    public static boolean wordBreak2(String s, List<String> wordDict) {
        HashSet<String> words = new HashSet<>(wordDict);
    	boolean[] check = new boolean[s.length() + 1];
    	check[0] = true;
    	
    	for (int i = 1; i < s.length() + 1; i++)
    	{
    		for (int j = 0; j < i; j++)
    		{
    			if (check[j] && words.contains(s.substring(j, i)))
    			{
    				check[i] = true;
    			}
    		}
    	}
    	return check[s.length()];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s = new ArrayList<String>();
		s.add("cats");
		s.add("and");
		s.add("dog");
		
		System.out.println(wordBreak2("catsanddog", s));

	}

}
