import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode139 {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][] test = new boolean[1][1];
		
		if(test[0][0])
		{
			System.out.println("ture");
		}
		else
		{
			System.out.println("false");
		}
		
		
	}

}
