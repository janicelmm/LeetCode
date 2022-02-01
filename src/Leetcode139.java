import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
                
        for (String a : wordDict)
        {
            String segment = "";
            
            for (int i = 0; i < a.length(); i++)
            {
                segment = segment + a.charAt(i);
            }
            
            if (s.contains(segment))
            {
                s = s.split(segment).toString();
            }
        }
        
        if (s.length()== 0)
        {
            return true;
        }
        
        return false;
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
