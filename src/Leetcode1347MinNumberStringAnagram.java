import java.util.HashMap;

public class Leetcode1347MinNumberStringAnagram {
    public static int minSteps(String s, String t) {
    	
        HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++)
        {
            if (temp.containsKey(s.charAt(i)))
            {
                temp.put(s.charAt(i), temp.get(s.charAt(i)) + 1);
            }
            else
            {
                temp.put(s.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < t.length(); i++)
        {
            if (temp.containsKey(t.charAt(i)))
            {
                temp.put(t.charAt(i), temp.get(t.charAt(i))- 1);
                if(temp.get(t.charAt(i)) <= 0)
                {
                    temp.remove(t.charAt(i));
                }
            }
        }
        
        int sum = 0;
        for (Character c : temp.keySet())
        {
        	sum += temp.get(c); 
        }
        
        return sum;
    }
    
    public static int minSteps2(String s, String t) {
	    int[] temp = new int[26];
	    int result = 0;
	    
	    for (int i = 0; i < s.length(); i++)
	    {
	        temp[s.charAt(i) - 'a']++;
	    }
	    
	    for (int i = 0; i < t.length(); i++)
	    {
	        if (temp[t.charAt(i) - 'a']-- <= 0)
	        {
	            result++;
	        }
	    }
	    return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minSteps2("leetcode","practice"));
	}

}
