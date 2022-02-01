
public class CodeSignal3 {

	public static boolean checkPalindrome(String inputString) {
	    boolean result = true;
	    for(int i = 0; i < inputString.length() / 2; i++)
	    {
	        if (inputString.charAt(i) != inputString.charAt((inputString.length()-1)-i))
	        {
	            result = false;
	            break;
	        }            
	    }
	   
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome("aabaa"));
	}

}
