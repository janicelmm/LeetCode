  import java.util.LinkedList;
import java.util.Queue;

public class Leetcode5 {

//	public static String exploreOutwards(String s, int leftIdx, int rightIdx)
//    {
//		// this is the largest palindrome because to expand, it will be out of scope
//        if(leftIdx - 1 < 0 || rightIdx >= s.length())
//        {
//            return s.substring(leftIdx, rightIdx);
//        }
//        
//        // the surrounding characters equal to each other, therfore, there is a new largest palindrome
//        if(s.charAt(leftIdx - 1) == s.charAt(rightIdx))
//        {
//            return exploreOutwards(s, leftIdx -1, rightIdx + 1);
//        }
//        
//        // the surrounding charcters do NOT equal each other; therefore, this is the largest palindrome
//        return s.substring(leftIdx, rightIdx);
//    }
//    
//    public static String longestPalindrome(String s) 
//    {
//        String largest = "";
//        
//        for(int i = 0; i < s.length(); i++)
//        {
//            String a = exploreOutwards(s, i, i + 1);
//            String b = "";
//            
//            if(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1))
//            {
//                b = exploreOutwards(s, i, i + 2);
//            }
//            
//            largest = a.length() > largest.length() ? a : largest;
//            largest = b.length() > largest.length() ? b : largest;
//        }
//        
//        return largest;
	
//////////
	
	
//	public static String longestPalindrome(String s) 
//	{	
//		String largestPalindrome = "";
//		
//		// represents coordinates of a substring
//		Queue<int[]> palindromes = new LinkedList<int[]>();
//		
//		for(int i = 0; i < s.length(); i++)
//		{
//			palindromes.add(new int[]{i, i + 1}); 
//			
//			if(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1))
//			{
//				palindromes.add(new int[]{i, i + 2});
//			}
//		}
//		
//		while(!palindromes.isEmpty())
//		{
//			String tempPalindrome = "";
//			
//			int[] coordinates = palindromes.poll();
//			
//			int left = coordinates[0];
//			int right = coordinates[1];
//			
//			// If explore outwards is not possible due to out of scope, then compare the sizes for largest palindrome
//			if(left -1 < 0 || right + 1 > s.length())
//			{
//				tempPalindrome = s.substring(left, right);
//				largestPalindrome = largestPalindrome.length() > tempPalindrome.length() ? largestPalindrome : tempPalindrome;
//			}
//			// Explore outwards to find a bigger palindrome
//			else if((s.charAt(left - 1) == s.charAt(right)))
//			{
//				palindromes.add(new int[]{left - 1, right + 1});
//			}
//			else 
//			{
//				tempPalindrome = s.substring(left, right);
//				largestPalindrome = largestPalindrome.length() > tempPalindrome.length() ? largestPalindrome : tempPalindrome;
//			}
//		}
//		
//		return largestPalindrome;
//	}
    public static String findPalindrome(String s, int left, int right)
    {
    	while(true)
    	{
    		if(left-1 < 0 || right >= s.length())
            {
    			return s.substring(left, right);
            }
    		else if(s.charAt(left-1) == s.charAt(right))
            {
    			left--;
    			right++;
            }
    		else
    		{
    			return s.substring(left, right);
    		}	
    	}
    }
        
	public static String longestPalindrome(String s) 
	{
		String result = "";
  
		for(int i = 0; i < s.length(); i++)
		{
			int left = i;
			int right = i+1;
			String a = findPalindrome(s, left, right);
			
			if(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1))
			{
				left = i;
    			right = i+2;
    			result = findPalindrome(s, left, right);
			}
      
			result = a.length() > result.length() ? a : result;

		}
      
      return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abba")); 
	}

}
