import java.util.HashMap;
import java.util.HashSet;

public class Leetcode3LongestSubstringNoRepeat {
	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        int start = 0;
        String newString = "";
        int size = 0;
        
        for(int i =0; i < s.length(); i++)
        {
            if(m.containsKey(s.charAt(i)) && (m.get(s.charAt(i))>=start))
            {
                start = m.get(s.charAt(i))+1;
            }
            
            m.put(s.charAt(i), i);
            newString = s.substring(start, i) + s.charAt(i);
            size = Math.max(size, newString.length());
        }
        return size;
    }
	
	public static int lengthOfLongestSubstring2(String s) {
		int max = 0;
		int i = 0;
		int j = 0;
		HashSet<Character> set = new HashSet<Character>();
		
		while (i < s.length())
		{		
			if(!set.contains(s.charAt(i)))
			{
				set.add(s.charAt(i));
				max = Math.max(max, i-j+1);
				i++;
			}
			else
			{
				while (!set.contains(s.charAt(i)))
				{
					set.remove(s.charAt(j));
					j++;
				}
				set.add(s.charAt(i));
			}
		}
		return max;
    }
	
	public static int lengthOfLongestSubstring3(String s) {
		int max = 0;
        HashSet<Character> noRepeat = new HashSet<Character>();
        int j = 0; 
        
        for (int i = 0; i < s.length(); i++)
        {
            while (noRepeat.contains(s.charAt(i)) && (j < i))
            {
                noRepeat.remove(s.charAt(j));
                j++;
            }
            noRepeat.add(s.charAt(i));
            max = Math.max(max, i-j+1);
        }
        return max;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring3("pwwkew"));
	}

}
