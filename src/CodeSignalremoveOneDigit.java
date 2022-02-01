
public class CodeSignalremoveOneDigit {

	public static int removeOneDigit(String s, String t){

	    int ways = 0;
	    for (int i = 0; i < s.length(); i++) 
	    {

	        if (Character.isDigit(s.charAt(i))) 
	        {

	            String s1 = s.substring(0, i) + s.substring(i + 1);

	            if (s1.compareTo(t) < 0 || t.compareTo(s1) < 0)
	                ways++;

	        }
	        
	    }
	    
	    for (int i = 0; i < t.length(); i++) 
	    {

	        if (Character.isDigit(t.charAt(i))) 
	        {

	            String s2 = t.substring(0, i) + t.substring(i + 1);

	            if (s2.compareTo(s) < 0 || s.compareTo(s2) < 0)
	                ways++;
	        }
	        
	    }
	   
	    return ways;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeOneDigit("ab12c","ab24z"));
	}

}
