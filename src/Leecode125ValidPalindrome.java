
public class Leecode125ValidPalindrome {

    public static boolean isPalindrome(String s) {
         
     	if (s.length() == 1)
        {
            return true;
        }
     	
    	 String temp = "";
         
         for(int i = 0; i < s.length(); i++)
         {
             if (Character.isLetter(s.charAt(i)))
             {
                 temp += s.charAt(i);
             }
         }
         
     	if (temp.length() <= 1)
        {
            return true;
        }

         int endindex = temp.length() - 1;
         
         boolean result = false;
         
         for (int j = 0; j < temp.length()/2; j++)
         {
         	if(Character.toLowerCase(temp.charAt(j)) == Character.toLowerCase(temp.charAt(endindex)))
         	{
         		result = true;
         		endindex --;
         	}
         	else
         	{
         		return false;
         	}
         }
         
         return result;
    }
    
    public static boolean isPalindrome2(String s) {
      String a = "";
      
      for (int i = 0; i < s.length(); i++)
      {
    	  if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
    	  {
    		  a += s.charAt(i); 
    	  }
      }
      
      if (a.length() == 0)
      {
    	  return true;
      }
      
      a = a.toLowerCase();
      int end = a.length() - 1;
      
      for (int j = 0; j < a.length()/2; j++)
      {
    	  if(a.charAt(j) != a.charAt(end))
    	  {
    		  return false;
    	  }
    	  end--;
      }
      
      return true;
      
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("race a car"));
	}

}
