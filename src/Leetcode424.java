
public class Leetcode424 {
//	public static int characterReplacement2(String s, int k) {
//        int max = 0;
//        
//        for (int i = 0; i < s.length(); i++)
//        {
//            
//            char c = s.charAt(i);
//            int count = 1;
//            int chance = k;
//        
//            for (int j = 0; j < s.length(); j++)
//            {
//            	if (i != j)
//            	{
//                    if (s.charAt(j) == c)
//                    {
//                        count++;
//                    }
//                    
//                    if ((s.charAt(j) != c) && (chance > 0))
//                    {
//                        count++;
//                        chance--;
//                    }
//                    else if ((s.charAt(j) != c) && (chance == 0))
//                    {
//                    	break;
//                    }
//            	}
//            }
//            
//            max = Math.max(count, max);
//                
//        }
//        return max;
//    }

	private static int count = 1;
	    
	public static int characterReplacement(String s, int k) {      
	        
        int max = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            int count = checkLongest(s, i, k);
            max = Math.max(max, count);
        }
        
        return max;

    }
	    
    public static int checkLongest(String s, int j, int k)
    {
        int left = j-1;
        int right = j+1;
        char match = s.charAt(j);
        count = 1;
         
        while (true)
        {
            if ((left < 0) || (right > s.length() - 1))
            {
            	return count;
            } 

            if ((s.charAt(left) == match) && (s.charAt(right) == match) && (k > 0))
            {
                count++;
                left--;
                right++;
            }
            else if ((s.charAt(left) != match) && (s.charAt(right) == match) && (k > 0))
            {
                count++;
                k--;
                left--;
                right++;
            }
            else if ((s.charAt(left) == match) && (s.charAt(right) != match) && (k > 0))
            {
                count++;
                k--;
                left--;
                right++;
            }
            else if ((s.charAt(left) != match) && (s.charAt(right) != match) && (k > 0))
            {
                count = count+2;
                k = k-2;
                left--;
                right++;
            }
            else
            {
                return count;
            }
        }     
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(characterReplacement("AABABBA", 1));
	}

}
