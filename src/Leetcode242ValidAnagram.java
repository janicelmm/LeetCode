import java.util.HashMap;

public class Leetcode242ValidAnagram {

	 public static boolean isAnagram(String s, String t) {
	        HashMap<Character, Integer> count = new HashMap<Character,Integer>();
	        
	        if (s.length() != t.length())
	        {
	            return false;
	        }
	                
	        for (int i = 0; i < s.length(); i++)
	        {
	            if (!count.containsKey(s.charAt(i)))
	            {
	                count.put(s.charAt(i), 1);
	            }
	            else
	            {
	                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
	            }
	        }
	        
	        for (int j = 0; j < t.length(); j++)
	        {
	            if (count.containsKey(t.charAt(j)))
	            {
	                count.put(t.charAt(j), count.get(t.charAt(j)) - 1);
	                
	                if (count.get(t.charAt(j)) == 0)
	                {
	                    count.remove(t.charAt(j));
	                }
	            }
	            else
	            {
	                return false;
	            }
	        }
	        
	        if (count.size() == 0)
	        {
	             return true;
	        }
	        
	        return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("anagram","nagaram"));
	}

}
